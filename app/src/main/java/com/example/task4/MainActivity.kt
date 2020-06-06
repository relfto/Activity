package com.example.task4
import android.widget.Button
import android.widget.TextView
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        var count = 0;
        val rb = findViewById<Button>(R.id.Bt2)
        val rr = findViewById<TextView>(R.id.tx)
        rb.setOnClickListener {
            count++;
            rr.text = count.toString();

        
        Bt1.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            }
        }
    }
}
