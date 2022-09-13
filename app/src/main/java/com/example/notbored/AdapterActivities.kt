package com.example.notbored

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterActivities(
    private val listActivities: List<ActivityModel>,
    val activitySelected: (ActivityModel) -> Unit
) : RecyclerView.Adapter<AdapterActivities.ActivitiesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivitiesViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_item, parent, false)
        return ActivitiesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ActivitiesViewHolder, position: Int) {
        val activity = listActivities[position]
        holder.textActivity.text = activity.category
        holder.itemView.setOnClickListener {
            activitySelected(activity)
        }
    }

    override fun getItemCount(): Int = 9

    class ActivitiesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textActivity: TextView = itemView.findViewById(R.id.text_activity)
    }
}