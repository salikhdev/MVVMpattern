package uz.salikhdev.mvvmpattern.core.network.service

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import uz.salikhdev.mvvmpattern.core.model.NewsResponse

interface NewsService {


    @GET("/v2/everything")
    suspend fun loadNews(
        @Query("q") q: String,
        @Query("apiKey") apiKey: String
    ): Response<NewsResponse?>

}