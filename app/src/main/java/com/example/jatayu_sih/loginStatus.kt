package com.example.jatayu_sih

import android.content.Context
import android.content.SharedPreferences

class loginStatus (context: Context) {

    private val PREFS_NAME = "MyAppPrefs"
    private val KEY_USERNAME = "username"
    private val KEY_PASSWORD = "password"
    private val KEY_IS_LOGGED_IN = "isLoggedIn"
    private val KEY_STATUS = "status"
    private val KEY_TOKEN = "token"
    private val KEY_USER_ID = "userId"
    private val KEY_USER_ROLE = "userRole"
    private val KEY_TEAM = "team"
    private val KEY_ORGANISATION = "organisation"
    private val KEY_SESSIONS_ID = "sessionsid"
    private val KEY_ESTIMATED_AFFECTEES = "estimatedAffectees"
    private val KEY_LONG = "long"
    private val KEY_LAT = "lat"


    private val sharedPreferences: SharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)


    var lat: String?
        get() = sharedPreferences.getString(KEY_LAT, null)
        set(value) = sharedPreferences.edit().putString(KEY_LAT, value).apply()

    var sessionsId: String?
        get() = sharedPreferences.getString(KEY_SESSIONS_ID, null)
        set(value) = sharedPreferences.edit().putString(KEY_SESSIONS_ID, value).apply()

    var estimatedAffectees: Int
        get() = sharedPreferences.getInt(KEY_ESTIMATED_AFFECTEES, 0)
        set(value) = sharedPreferences.edit().putInt(KEY_ESTIMATED_AFFECTEES, value).apply()

    var long: String?
        get() = sharedPreferences.getString(KEY_LONG, null)
        set(value) = sharedPreferences.edit().putString(KEY_LONG, value).apply()
    var team: String?
        get() = sharedPreferences.getString(KEY_TEAM, null)
        set(value) = sharedPreferences.edit().putString(KEY_TEAM, value).apply()

    var organisation: String?
        get() = sharedPreferences.getString(KEY_ORGANISATION, null)
        set(value) = sharedPreferences.edit().putString(KEY_ORGANISATION, value).apply()

    var username: String?
        get() = sharedPreferences.getString(KEY_USERNAME, null)
        set(value) = sharedPreferences.edit().putString(KEY_USERNAME, value).apply()

    var password: String?
        get() = sharedPreferences.getString(KEY_PASSWORD, null)
        set(value) = sharedPreferences.edit().putString(KEY_PASSWORD, value).apply()

    var isLoggedIn: Boolean
        get() = sharedPreferences.getBoolean(KEY_IS_LOGGED_IN, false)
        set(value) = sharedPreferences.edit().putBoolean(KEY_IS_LOGGED_IN, value).apply()

    var status: String?
        get() = sharedPreferences.getString(KEY_STATUS, null)
        set(value) = sharedPreferences.edit().putString(KEY_STATUS, value).apply()

    var token: String?
        get() = sharedPreferences.getString(KEY_TOKEN, null)
        set(value) = sharedPreferences.edit().putString(KEY_TOKEN, value).apply()

    var userId: String?
        get() = sharedPreferences.getString(KEY_USER_ID, null)
        set(value) = sharedPreferences.edit().putString(KEY_USER_ID, value).apply()

    var userRole: String?
        get() = sharedPreferences.getString(KEY_USER_ROLE, null)
        set(value) = sharedPreferences.edit().putString(KEY_USER_ROLE, value).apply()
}