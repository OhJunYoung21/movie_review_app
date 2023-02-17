package com.example.movie_review_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.movie_review_app.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class SignupActivity : AppCompatActivity() {

    lateinit var binding: ActivitySignupBinding

    lateinit var mAuth: FirebaseAuth

    private lateinit var mDbRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mAuth = Firebase.auth

        mDbRef  = Firebase.database.reference

        binding.complete.setOnClickListener {

            val name = binding.name.text.toString().trim()
            val email = binding.emailSignup.text.toString().trim()
            val password = binding.passwordSignup.text.toString().trim()

            signUp(name, email,password)

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }
    }

    private fun signUp(name: String, email: String, password: String) {

        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->
            if (task.isSuccessful) {
                addUsertoDatabase(name, email, mAuth.currentUser?.uid!!)
                Toast.makeText(this, "회원가입 성공", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)


            } else {
                Toast.makeText(this, "회원가입 실패", Toast.LENGTH_SHORT).show()
                Log.d("signup", "error:${task.exception}")
            }

        }

    }

    private fun addUsertoDatabase(name: String, email: String, uid: String) {
        mDbRef.child("user").child(uid)
            .setValue(User(name, email, uid))     //child 메소드로 mDbRef의 uid에 접근하여 User의 프로퍼티를 저장한다.
    }


}