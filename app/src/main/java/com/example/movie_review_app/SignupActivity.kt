package com.example.movie_review_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.movie_review_app.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase

class SignupActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding

    lateinit var mAuth: FirebaseAuth

    private lateinit var mDbRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.complete.setOnClickListener {

            val name = binding.name.text.toString().trim()
            val email = binding.email.text.toString().trim()
            val password = binding.passwordSignup.text.toString().trim()


            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }
    }

    private fun signUp(name: String, email: String, password: String) {

        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->
            if (task.isSuccessful) {
                Toast.makeText(this, "회원가입 성공", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, LoginActivity::class.java))
                addUsertoDatabase(name, email, mAuth.currentUser?.uid!!)

            } else {
                Toast.makeText(this, "회원가입 실패", Toast.LENGTH_SHORT).show()
                Log.d("signup", "error:${task.exception}")
            }

        }

    }

    private fun addUsertoDatabase(name: String, email: String, uid: String) {
        mDbRef.child("user").child(uid).setValue(User(name, email, uid))
    }


}