package uz.salikhdev.mvvmpattern.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import uz.salikhdev.mvvmpattern.core.model.NewsResponse
import uz.salikhdev.mvvmpattern.core.repositroy.NewsRepository

class MainVM : ViewModel() {

    private val repository = NewsRepository()

    val newsLiveData: MutableLiveData<NewsResponse?> = MutableLiveData()
    val errorLiveData: MutableLiveData<String?> = MutableLiveData()


    fun getNewsData() {

        CoroutineScope(Dispatchers.IO).launch {

            val result = repository.getNews()

            if (result.data != null) {
                newsLiveData.postValue(result.data)
            } else {
                errorLiveData.postValue(result.error)
            }

        }


    }


}