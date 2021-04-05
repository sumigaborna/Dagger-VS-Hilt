package com.sumigaborna.daggervshilt.ui.images

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sumigaborna.daggervshilt.data.ImagesResponse
import com.sumigaborna.daggervshilt.data.ImagesResponseItem
import com.sumigaborna.daggervshilt.ui.images.repo.ImagesRepositoryImpl
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import javax.inject.Inject

class ImagesViewModel @Inject constructor(private val imagesRepositoryImpl: ImagesRepositoryImpl) :
    ViewModel() {

    private val _images = MutableLiveData<ImagesResponse>()
    val images: LiveData<ImagesResponse> = _images

    private val handler = CoroutineExceptionHandler { coroutineContext, throwable ->
        Log.e("ImagesViewModel", "Error in ImagesViewModel: ${throwable.message}")
    }

    fun getImages() {
        viewModelScope.launch(handler) {
            val images = listOf<ImagesResponseItem>(
                ImagesResponseItem(0,1,"","","https://hatrabbits.com/wp-content/uploads/2017/01/random.jpg"),
                ImagesResponseItem(0,2,"","","https://hatrabbits.com/wp-content/uploads/2017/01/random.jpg"),
                ImagesResponseItem(0,3,"","","https://hatrabbits.com/wp-content/uploads/2017/01/random.jpg"),
                ImagesResponseItem(0,4,"","","https://hatrabbits.com/wp-content/uploads/2017/01/random.jpg"),
            )
            val imagesResponse = ImagesResponse()
            imagesResponse.addAll(images)
            _images.value = imagesResponse
            //TODO: Switch to another API, these images don't work
           /* imagesRepositoryImpl.getImages().let {
                _images.value = it
            }*/
        }
    }

}