package com.alerecchi.baseproject.presentation.view.recyclerview.viewholder

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alerecchi.baseproject.R
import com.alerecchi.baseproject.presentation.view.recyclerview.RecyclerViewModel

class EmptyViewHolder(itemView: View) : LifecycleViewHolder(itemView) {

    companion object {
        fun newInstance(parent: ViewGroup): EmptyViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.view_empty_item, parent, false)
            return EmptyViewHolder(view)
        }
    }

    override fun bindTo(model: RecyclerViewModel) {
        Log.d("EmptyViewHolder", "Created empty view holder")
    }
}