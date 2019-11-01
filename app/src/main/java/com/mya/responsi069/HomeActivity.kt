package com.mya.responsi069

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    val kopi = arrayOf<String>(
        "Capuccino",
        "Affogato",
        "Americano",
        "Cortado",
        "Espresso",
        "Coffe Milk",
        "Latte",
        "Macchiato",
        "Mocaccino",
        "Ristretto")

    val Gambar = arrayOf<Int>(
        R.drawable.capuccino,
        R.drawable.affogato,
        R.drawable.americano,
        R.drawable.cortado,
        R.drawable.espresso,
        R.drawable.kopisusu,
        R.drawable.late,
        R.drawable.macchiato,
        R.drawable.mochaccino,
        R.drawable.ristretto)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val Ladapter = ListAdapter(this, kopi, Gambar)
        jns_kopi.adapter = Ladapter

        val bundle = intent.extras
        val namaLog = bundle?.get("namaLog").toString()
        val unameLog = bundle?.get("unameLog").toString()
        val passLog = bundle?.get("passLog").toString()

        btn_det.setOnClickListener {
            intent = Intent(this, AccountActivity::class.java)
            intent.putExtra("namaLog", namaLog)
            intent.putExtra("unameLog", unameLog)
            intent.putExtra("passLog", passLog)
            startActivity(intent)
        }

        jns_kopi.setOnItemClickListener() { adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemIdAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)

            var a = Integer.parseInt(itemIdAtPos.toString())
            var pr = a + 1

            if (a.equals(0)) {
                Toast.makeText(this, "Kopi Cappuccino", Toast.LENGTH_LONG).show()
            } else if (a.equals(1)) {
                Toast.makeText(this, "Kopi Affogato", Toast.LENGTH_LONG).show()
            } else if (a.equals(2)) {
                Toast.makeText(this, "Kopi Americano", Toast.LENGTH_LONG).show()
            } else if (a.equals(3)) {
                Toast.makeText(this, "Kopi Cortado", Toast.LENGTH_LONG).show()
            } else if (a.equals(4)) {
                Toast.makeText(this, "Kopi Espreso", Toast.LENGTH_LONG).show()
            } else if (a.equals(5)) {
                Toast.makeText(this, "Kopi Coffe Milk", Toast.LENGTH_LONG).show()
            } else if (a.equals(6)) {
                Toast.makeText(this, "Kopi Latte", Toast.LENGTH_LONG).show()
            } else if (a.equals(7)) {
                Toast.makeText(this, "Kopi Machiato", Toast.LENGTH_LONG).show()
            } else if (a.equals(8)) {
                Toast.makeText(this, "Kopi Mochaccino", Toast.LENGTH_LONG).show()
            } else if (a.equals(9)) {
                Toast.makeText(this, "Kopi Risretto", Toast.LENGTH_LONG).show()
            }
        }
    }
}