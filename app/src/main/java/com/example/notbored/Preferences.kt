package com.example.notbored

import android.content.Context
import android.content.SharedPreferences
import com.example.notbored.Constants

class Preferences(context: Context) {

    private val storage: SharedPreferences =
        context.getSharedPreferences(Constants.PREFERENCES.SHARED_KEY, 0)

    fun saveParticipants(key: String, numberParticipants: String) {
        storage.edit().putString(key, numberParticipants).apply()
    }

    fun getParticipants(key: String): Int {
        return storage.getInt(key, 0)
    }
}