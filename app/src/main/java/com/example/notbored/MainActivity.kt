package com.example.notbored

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notbored.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.textTerms.setOnClickListener {
            handleTerms()
        }
        binding.buttonStart.setOnClickListener {
            handleStart()
        }
    }

    private fun handleTerms() {
        startActivity(Intent(this, TermsAndConditionsActivity::class.java))
    }

    private fun handleStart(){
        val numberParticipants = binding.editNumberParticipants.text.toString()
        Preferences(this).saveParticipants(Constants.PREFERENCES.PARTICIPANTS_KEY, numberParticipants)
        val intent = Intent(this, ActivitiesListActivity::class.java)
        startActivity(intent)
    }
}