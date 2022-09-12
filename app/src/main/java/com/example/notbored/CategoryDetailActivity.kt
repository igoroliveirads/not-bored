package com.example.notbored

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notbored.databinding.ActivityCategoryDetailBinding

class CategoryDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCategoryDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageBack.setOnClickListener {
            finish()
        }

        binding.buttonTryAnother.setOnClickListener {
            getInfoTryAnother()
        }

        getInfo()
    }

    private fun getInfo() {
        val numberParticipants = Preferences(this).getParticipants(Constants.PREFERENCES.PARTICIPANTS_KEY)
        val category = intent.getStringExtra(Constants.KEY.CATEGORY_ACTIVITY)
        val description = intent.getStringExtra(Constants.KEY.DESCRIPTION_ACTIVITY)
        val price = intent.getStringExtra(Constants.KEY.PRICE_ACTIVITY)

        binding.textCategory.text = category
        binding.textDescription.text = description
        binding.textNumberParticipants.text = numberParticipants
        binding.textLevelPrice.text = price
    }

    private fun getInfoTryAnother() {
        val numberParticipants = Preferences(this).getParticipants(Constants.PREFERENCES.PARTICIPANTS_KEY)
        val activity = getNewActivity()
        if (activity != null) {
            binding.textCategory.text = activity.category
            binding.textDescription.text = activity.description
            binding.textNumberParticipants.text = numberParticipants
            binding.textLevelPrice.text = activity.price
        }
    }

    private fun getNewActivity(): ActivityModel? {
        val id = intent.getIntExtra(Constants.KEY.ID_ACTIVITY, 0)
        val category = intent.getStringExtra(Constants.KEY.CATEGORY_ACTIVITY)
        val activitiesList = ActivityList.getActivityList()

        activitiesList.let { activity ->
            return activity.firstOrNull { it.category == category && it.id != id }
        }
    }
}