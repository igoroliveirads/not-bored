package com.example.notbored

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.notbored.databinding.ActivityTermsAndConditionsBinding

class TermsAndConditionsActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityTermsAndConditionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTermsAndConditionsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.imageClose.setOnClickListener(this)
        supportActionBar?.hide()
    }

    override fun onClick(view: View) {
        if (view.id == R.id.image_close){
            handleClose()
        }
    }

    private fun handleClose(){
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}