package com.kryptkode.recounter.counter

import com.kryptkode.recounter.redux.State

data class CounterState (
        val count:Int = 0
    ): State