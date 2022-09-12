package com.example.notbored

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notbored.databinding.ActivityRandomDetailBinding

class RandomDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRandomDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRandomDetailBinding.inflate(layoutInflater)
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
        val listActivities = ActivityList.getActivityList()
        val randomActivity = (0..listActivities.size).random()
        val activity = getNewActivity(randomActivity)
        if (activity != null) {
            binding.textCategory.text = activity.category
            binding.textDescription.text = activity.description
            binding.textNumberParticipants.text = activity.participants.toString()
            binding.textLevelPrice.text = activity.price
            }
        }
    }

    private fun getNewActivity(id: Int): ActivityModel? {
        val activitiesList = ActivityList.getActivityList()
        activitiesList.let { activity ->
            return activity.firstOrNull{ it.id == id}
        }
}