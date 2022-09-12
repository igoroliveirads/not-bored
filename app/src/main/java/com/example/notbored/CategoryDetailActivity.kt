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
//        val numberParticipants = Preferences(this).getParticipants(Constants.PREFERENCES.PARTICIPANTS_KEY).toString()
        val category = intent.getStringExtra(Constants.KEY.CATEGORY_ACTIVITY)
        val description = intent.getStringExtra(Constants.KEY.DESCRIPTION_ACTIVITY)
        val participants = intent.getIntExtra(Constants.KEY.PARTICIPANTS_ACTIVITY, 0)
        val price = intent.getStringExtra(Constants.KEY.PRICE_ACTIVITY)

        binding.textCategory.text = category
        binding.textDescription.text = description
        binding.textNumberParticipants.text = participants.toString()
        binding.textLevelPrice.text = price
    }

    private fun getInfoTryAnother() {
        val activity = getNewActivity()
        binding.textCategory.text = activity?.category
        binding.textDescription.text = activity?.description
        binding.textNumberParticipants.text = activity?.participants.toString()
        binding.textLevelPrice.text = activity?.price
    }

    private fun getNewActivity(): ActivityModel? {
        val id = intent.getIntExtra(Constants.KEY.ID_ACTIVITY, 0)
        val category = intent.getStringExtra(Constants.KEY.CATEGORY_ACTIVITY)
        val activitiesList = ActivityList.getActivityList()

        for (activity in activitiesList) {
            if (activity.category == category && activity.id != id)
                return activity
        }
        return null
    }

}