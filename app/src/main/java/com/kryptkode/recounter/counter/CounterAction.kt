package com.kryptkode.recounter.counter

import com.kryptkode.recounter.redux.Action

sealed  class CounterAction : Action {
    object Init: CounterAction()
    object Increment: CounterAction()
    object Decrement: CounterAction()
}