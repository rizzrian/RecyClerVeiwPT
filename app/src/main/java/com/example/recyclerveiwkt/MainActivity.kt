package com.example.recyclerveiwkt

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val profilList = arrayListOf(
            Profiles(R.drawable.man, "삶은계란리안", "30", "안드로이드개발자")
                    Profiles (R.drawable.man,"박드로이드", "22", "하이브리드앱개발자")
        Profiles(R.drawable.woman, "공드로이드", "40", "클린앱개발자")
        Profiles(R.drawable.woman, "정드로이드", "20", "배고픈앱개발자")
        Profiles(R.drawable.man, "정드로이드", "22", "그냥앱개발자")
        Profiles(R.drawable.man, "고드로이드", "32", "플러터앱개발자")
        Profiles(R.drawable.man, "김드로이드", "19", "유니티앱개발자")
        Profiles(R.drawable.man, "민드로이드", "50", "리액트앱개발자")
        )
        //리스트 형태의 객체를 넣어줄 것임

        rv_profile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,failse)
        //세로방향으로 리스트뷰 해주세요.
        rv_profile.setHasFixdSize(true)
        //리사이클러뷰에 대한 성능개선

        rv_profile.ProfileAdapter(profilList)
        //여기서 어댑터를 최초 생성해준다 생각하기 만들어둔 어댑터
    }
}

























