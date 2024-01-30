package uz.salikhdev.mvvmpattern.core.repositroy

import uz.salikhdev.mvvmpattern.core.model.NewsResponse
import uz.salikhdev.mvvmpattern.core.network.ApiClient
import uz.salikhdev.mvvmpattern.core.util.ResultWrapper

class NewsRepository {


    private val service = ApiClient.createNewsService()

    suspend fun getNews(): ResultWrapper<NewsResponse> {

        val response = service.loadNews("bitcoin", "bd9811f655da4ff8ac5f705993082f11")

        if (response.isSuccessful) {
            response.body()?.let {
                return ResultWrapper(data = it)
            }
        }

        return ResultWrapper(error = "Error")
    }

}