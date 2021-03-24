package com.sumigaborna.daggervshilt.ui.images

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sumigaborna.daggervshilt.data.ImagesResponse
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
            imagesRepositoryImpl.getImages().let {
                _images.value = it
            }
        }
    }

}