package com.alerecchi.baseproject.presentation.rx

import com.alerecchi.baseproject.presentation.rx.events.Event
import com.jakewharton.rxrelay2.PublishRelay
import io.reactivex.Observable

object EventBus {

    private val publishRelay: PublishRelay<Event> = PublishRelay.create<Event>()

    fun post(event: Event) {
        publishRelay.accept(event)
    }

    fun observeEvents(eventClass: Class<out Event>): Observable<out Event> {
        return publishRelay.ofType(eventClass)
    }

}