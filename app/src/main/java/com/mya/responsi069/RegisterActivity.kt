package com.mya.responsi069

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val namaReg : EditText = findViewById(R.id.enama)
        val unameReg : EditText = findViewById(R.id.euname_reg)
        val passReg : EditText =findViewById(R.id.epass_reg)

        btn_regis.setOnClickListener{
            intent = Intent(this, MainActivity::class.java)
            intent.putExtra("namaReg",namaReg.text)
            intent.putExtra("unameReg",unameReg.text)
            intent.putExtra("passReg",passReg.text)
            Toast.makeText(this, "Akun Berhasil Diregistrasi", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }
}
