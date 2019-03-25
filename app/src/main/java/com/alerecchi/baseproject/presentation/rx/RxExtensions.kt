package com.alerecchi.baseproject.presentation.rx

import androidx.fragment.app.Fragment
import androidx.lifecycle.GenericLifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import io.reactivex.disposables.Disposable

/**
 * This extension tries to simplify the handling of disposables in lifecycle aware components. The behavior is similar
 * to the one described for LiveData in which an observable is not triggered anymore when the state is "lower" than CREATED.
 */
fun Disposable.bindToLifecycle(lifecycleOwner: LifecycleOwner) {
    val lifecycle = if (lifecycleOwner is Fragment) {
        lifecycleOwner.viewLifecycleOwner.lifecycle
    } else {
        lifecycleOwner.lifecycle
    }

    lifecycle.addObserver(GenericLifecycleObserver { owner, _ ->
        if (!owner.lifecycle.currentState.isAtLeast(Lifecycle.State.CREATED)) {
            try {
                dispose()
            } catch (_: Exception) {
            }
        }
    })
}