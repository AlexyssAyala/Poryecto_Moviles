package com.example.poryecto2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.poryecto2.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_sign_in.*

class activity_sign_in : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        //Metodo para atras
        btn_atras.setOnClickListener{
        val intent:Intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
