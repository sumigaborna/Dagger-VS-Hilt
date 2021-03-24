package com.sumigaborna.daggervshilt.ui.images.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.sumigaborna.daggervshilt.R
import com.sumigaborna.daggervshilt.binding.FragmentDataBindingComponent
import com.sumigaborna.daggervshilt.databinding.FragmentImagesBinding
import com.sumigaborna.daggervshilt.di.Injectable
import com.sumigaborna.daggervshilt.di.ViewModelProviderFactory
import com.sumigaborna.daggervshilt.ui.common.ImageListAdapter
import com.sumigaborna.daggervshilt.ui.images.ImagesViewModel
import com.sumigaborna.daggervshilt.util.autoCleared
import javax.inject.Inject

class ImagesFragment : Fragment(), Injectable {

    @Inject
    lateinit var providerFactory: ViewModelProviderFactory

    var binding by autoCleared<FragmentImagesBinding>()
    var dataBindingComponent: DataBindingComponent = FragmentDataBindingComponent(this)
    private var adapter by autoCleared<ImageListAdapter>()
    private val viewModel: ImagesViewModel by viewModels { providerFactory }

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
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = viewLifecycleOwner
        initRecycler()
        initImagesList()
        initObservers()
    }

    private fun initRecycler() {
        val rvAdapter = ImageListAdapter(
            dataBindingComponent = dataBindingComponent
        ) {}
        binding.rvImage.adapter = rvAdapter
        this.adapter = rvAdapter
    }

    private fun initImagesList() {
        viewModel.getImages()
    }

    private fun initObservers() {
        viewModel.images.observe(viewLifecycleOwner, {
            println("Observe is: $it")
            adapter.submitList(it)
        })
    }
}