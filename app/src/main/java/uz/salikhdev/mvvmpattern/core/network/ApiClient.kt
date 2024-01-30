package uz.salikhdev.mvvmpattern.core.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import uz.salikhdev.mvvmpattern.core.network.service.NewsService

object ApiClient {


    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://newsapi.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun createNewsService() : NewsService = getRetrofit().create(NewsService::class.java)



}