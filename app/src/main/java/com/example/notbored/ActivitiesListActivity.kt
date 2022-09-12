package com.example.notbored

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notbored.databinding.ActivityActivitiesListBinding

class ActivitiesListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityActivitiesListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActivitiesListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageRandom.setOnClickListener {
            putInfoRandom()
        }

        initRecyclerActivities()
    }

    private fun initRecyclerActivities() {
        binding.recyclerActivities.layoutManager = LinearLayoutManager(this)
        binding.recyclerActivities.setHasFixedSize(true)
        binding.recyclerActivities.adapter =
            AdapterActivities(ActivityList.getActivityList()) { activity ->
                putInfo(activity)
            }
    }

    private fun putInfo(activity: ActivityModel) {
        val intent = Intent(this, CategoryDetailActivity::class.java)
        intent.putExtra(Constants.KEY.ID_ACTIVITY, activity.id)
        intent.putExtra(Constants.KEY.CATEGORY_ACTIVITY, activity.category)
        intent.putExtra(Constants.KEY.DESCRIPTION_ACTIVITY, activity.description)
        intent.putExtra(Constants.KEY.PARTICIPANTS_ACTIVITY, activity.participants)
        intent.putExtra(Constants.KEY.PRICE_ACTIVITY, activity.price)
        startActivity(intent)
    }

    private fun putInfoRandom() {
        val intent = Intent(this, RandomDetailActivity::class.java)
        val listActivities = ActivityList.getActivityList()
        val randomActivity = (0..listActivities.size).random()
        val activity = listActivities[randomActivity]
        intent.putExtra(Constants.KEY.ID_ACTIVITY, activity.id)
        intent.putExtra(Constants.KEY.CATEGORY_ACTIVITY, activity.category)
        intent.putExtra(Constants.KEY.DESCRIPTION_ACTIVITY, activity.description)
        intent.putExtra(Constants.KEY.PARTICIPANTS_ACTIVITY, activity.participants)
        intent.putExtra(Constants.KEY.PRICE_ACTIVITY, activity.price)
        startActivity(intent)

    }
}