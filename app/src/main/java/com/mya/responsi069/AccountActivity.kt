package com.mya.responsi069

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import  kotlinx.android.synthetic.main.activity_account.*
import kotlinx.android.synthetic.main.activity_main.*

class AccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val bundle = intent.extras
        val namaLog = bundle?.get("namaLog").toString()
        val unameLog = bundle?.get("unameLog").toString()
        val passLog = bundle?.get("passLog").toString()

        tnama.setText("Nama : " +namaLog)
        tuname.setText("Usewname : " +unameLog)
        tpass.setText("Password : " +passLog)

        btn_back.setOnClickListener{
            intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
