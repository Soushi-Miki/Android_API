package app.miki.mikiso.skilllistapii

import android.renderscript.Script
import com.google.gson.annotations.SerializedName

data class User(val name: String,
                @SerializedName("login") val userID: String,
                @SerializedName("avatar_url") val avatarUrl: String,
                val following: Int,
                val followers: Int)