package com.kryptkode.recounter

import com.kryptkode.recounter.counter.CounterState
import com.kryptkode.recounter.counter.counterStateReducer
import com.kryptkode.recounter.redux.DefaultStore

object DI {
    val store = DefaultStore(initialState = CounterState(), reducer = counterStateReducer)
}