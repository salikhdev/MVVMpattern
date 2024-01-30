package uz.salikhdev.mvvmpattern.core.model


import com.google.gson.annotations.SerializedName

data class Source(
    @SerializedName("id")
    val id: String, // engadget
    @SerializedName("name")
    val name: String // Engadget
)