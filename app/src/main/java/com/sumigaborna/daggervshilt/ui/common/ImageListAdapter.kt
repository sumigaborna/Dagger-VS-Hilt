package com.sumigaborna.daggervshilt.ui.common

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import com.sumigaborna.daggervshilt.R
import com.sumigaborna.daggervshilt.data.ImagesResponseItem
import com.sumigaborna.daggervshilt.databinding.ItemImageBinding

class ImageListAdapter(
    private val dataBindingComponent: DataBindingComponent,
    private val imageClickCallback: ((ImagesResponseItem) -> Unit)?
) : DataBoundListAdapter<ImagesResponseItem, ItemImageBinding>(
    diffCallback = object : DiffUtil.ItemCallback<ImagesResponseItem>() {
        override fun areItemsTheSame(
            oldItem: ImagesResponseItem,
            newItem: ImagesResponseItem
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: ImagesResponseItem,
            newItem: ImagesResponseItem
        ): Boolean {
            return oldItem.url == newItem.url && oldItem.albumId == newItem.albumId
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

    override fun bind(binding: ItemImageBinding, item: ImagesResponseItem) {
        binding.imageItem = item
    }
}