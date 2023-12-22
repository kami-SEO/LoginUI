package com.example.loginui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener{
            //아이디 적힌 입력값 비번 입력값 저장
            val inputId = binding.idEdt.text.toString()
            val inputPw = binding.passwordEdt.text.toString()
            //두개 변수 검사
            //맞을 떄 틀릴때 처리
            //id+pW 모두
            if (inputId =="admin@test.com" && inputPw == "qwer"){
                //둘다 맞으면 토스트 실행 
                Toast.makeText(this, "관리자입니다", Toast.LENGTH_SHORT).show()

            }
            else{
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()


            }


        }
    }
}