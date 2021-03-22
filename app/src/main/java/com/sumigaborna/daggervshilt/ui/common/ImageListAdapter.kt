package com.sumigaborna.daggervshilt.ui.common

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import com.sumigaborna.daggervshilt.AppExecutors
import com.sumigaborna.daggervshilt.R
import com.sumigaborna.daggervshilt.data.ImageItem
import com.sumigaborna.daggervshilt.databinding.ItemImageBinding

class ImageListAdapter(
    private val dataBindingComponent: DataBindingComponent,
    appExecutors: AppExecutors,
    private val imageClickCallback: ((ImageItem) -> Unit)?
) : DataBoundListAdapter<ImageItem, ItemImageBinding>(
    appExecutors = appExecutors,
    diffCallback = object : DiffUtil.ItemCallback<ImageItem>() {
        override fun areItemsTheSame(oldItem: ImageItem, newItem: ImageItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ImageItem, newItem: ImageItem): Boolean {
            return oldItem.imageUrl == newItem.imageUrl
        }
    }
) {

    override fun createBinding(parent: ViewGroup): ItemImageBinding {
        val binding = DataBindingUtil.inflate<ItemImageBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_image,
            parent,
            false,
            dataBindingComponent
        )
        binding.root.setOnClickListener {
            //TODO: Not yet implemented
        }
        return binding
    }

    override fun bind(binding: ItemImageBinding, item: ImageItem) {
        binding.imageItem = item
    }
}