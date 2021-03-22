package com.sumigaborna.daggervshilt.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import com.sumigaborna.daggervshilt.AppExecutors
import com.sumigaborna.daggervshilt.R
import com.sumigaborna.daggervshilt.binding.FragmentDataBindingComponent
import com.sumigaborna.daggervshilt.databinding.FragmentImagesBinding
import com.sumigaborna.daggervshilt.ui.common.ImageListAdapter
import com.sumigaborna.daggervshilt.util.autoCleared

class ImagesFragment : Fragment() {

    //TODO: Implement via DI
    lateinit var appExecutors: AppExecutors

    var binding by autoCleared<FragmentImagesBinding>()
    var dataBindingComponent: DataBindingComponent = FragmentDataBindingComponent(this)
    private var adapter by autoCleared<ImageListAdapter>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val dataBinding = DataBindingUtil.inflate<FragmentImagesBinding>(
            inflater,
            R.layout.fragment_images,
            container,
            false,
            dataBindingComponent
        )
        binding = dataBinding
        return inflater.inflate(R.layout.fragment_images, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lifecycleOwner = viewLifecycleOwner
        val rvAdapter = ImageListAdapter(
            dataBindingComponent = dataBindingComponent,
            appExecutors = appExecutors
        ){}
        binding.rvImage.adapter = rvAdapter
        this.adapter = rvAdapter
    }
}