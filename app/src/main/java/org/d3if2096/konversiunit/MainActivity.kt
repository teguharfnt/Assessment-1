package org.d3if2096.konversiunit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import org.d3if2096.konversiunit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            button.setOnClickListener{
                konversiUnit()
            }
        }
    }

    private fun konversiUnit() {
        //jika inputan kosong maka akan muncul popup
        val satuan_cm = binding.satuanCmInp.text.toString()
        if (TextUtils.isEmpty(satuan_cm)) {
            Toast.makeText(this, R.string.satuan_cm_invalid, Toast.LENGTH_LONG).show()
            return
        }

        //mengkonversi cm ke kaki
        val satuan_kaki = satuan_cm.toFloat() * 0.0328084

        //Update UI
        binding.kakiTextView.text = "%.2f".format(satuan_kaki)
    }
}

