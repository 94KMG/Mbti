package com.example.mbti

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.example.mbti.ui.theme.MbtiTheme

class SubActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme {
                Column {
                    val context = LocalContext.current as? Activity // Activity로 변환이 불가하면 null를 할당
                    
                    Button(onClick = {
                        context?.finish() //context가 null이 아니면 finish를 실행
                    }) {
                        Text(text = "닫기")
                    }
                    
                    Button(onClick = {
                        val intent = Intent(context, LastActivity::class.java)
                        context?.startActivity(intent)
                    }) {
                        Text(text = "이동")
                    }
                }
            }
        }
    }

}