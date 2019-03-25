package com.alerecchi.baseproject.presentation.view.recyclerview.viewholder

import android.view.View
import androidx.annotation.CallSuper
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import androidx.recyclerview.widget.RecyclerView
import com.alerecchi.baseproject.presentation.view.recyclerview.RecyclerViewModel
import kotlinx.android.extensions.LayoutContainer

abstract class LifecycleViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
    LayoutContainer, LifecycleOwner {

    @Suppress("LeakingThis") //Not actually leaking
    private val lifecycleRegistry = LifecycleRegistry(this)

    abstract fun bindTo(model: RecyclerViewModel)

    @CallSuper
    fun onAttachedToWindow() {
        lifecycleRegistry.markState(Lifecycle.State.CREATED)
    }

    @CallSuper
    fun onDetachedToWindow() {
        lifecycleRegistry.markState(Lifecycle.State.DESTROYED)
    }

    override fun getLifecycle(): Lifecycle = lifecycleRegistry

}