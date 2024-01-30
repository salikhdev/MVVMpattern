package uz.salikhdev.mvvmpattern.core.model


import com.google.gson.annotations.SerializedName

data class Article(
    @SerializedName("author")
    val author: String, // Karissa Bell
    @SerializedName("content")
    val content: String, // The Securities and Exchange Commission has approved the applications of 11 spot bitcoin ETFs in a highly anticipated decision that will make it much easier for people to dabble in cryptocurrency in… [+1453 chars]
    @SerializedName("description")
    val description: String, // The Securities and Exchange Commission has approved the applications of 11 spot bitcoin ETFs in a highly anticipated decision that will make it much easier for people to dabble in cryptocurrency investing without directly buying and holding bitcoin. The app…
    @SerializedName("publishedAt")
    val publishedAt: String, // 2024-01-10T22:41:25Z
    @SerializedName("source")
    val source: Source,
    @SerializedName("title")
    val title: String, // SEC approves bitcoin ETFs (for real this time)
    @SerializedName("url")
    val url: String, // https://www.engadget.com/sec-approves-bitcoin-etfs-for-real-this-time-224125584.html
    @SerializedName("urlToImage")
    val urlToImage: String // https://s.yimg.com/ny/api/res/1.2/n6iLNJ_9dtK.fT6WAXK1sA--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD03OTU-/https://s.yimg.com/os/creatr-uploaded-images/2024-01/3edf5140-afdd-11ee-bf7c-7918e1b9d963
)