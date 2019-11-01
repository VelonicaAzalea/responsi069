package com.mya.responsi069

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_reg.setOnClickListener{
            intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        btn_log.setOnClickListener {
            val bundle = intent.extras
            val namaLog = bundle?.get("namaReg").toString()
            val unameLog = bundle?.get("unameReg").toString()
            val passLog = bundle?.get("passReg").toString()

            val unameReg: EditText = findViewById(R.id.euname)
            val unameLogin = unameReg.text.toString()
            val passReg: EditText = findViewById(R.id.epass)
            val passLogin = passReg.text.toString()

            if(unameLogin == unameLog && passLogin == passLog){
                intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("namaLog",namaLog)
                intent.putExtra("unameLog",unameLog)
                intent.putExtra("passLog",passLog)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Username/Password salah!",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
