package com.example.movie_review_app

data class User(
    val name: String = "",
    val email: String = "",
    val uid: String = ""
) {
    //constructor() : this("","","")를 사용해서 defualt값을 설정해줘도 좋다. 이처럼 디폴트 생성자가 없으면 어떻게 변수가 정렬, 구성되는지를 알 수가 없어 오류가 발생한다.
}
