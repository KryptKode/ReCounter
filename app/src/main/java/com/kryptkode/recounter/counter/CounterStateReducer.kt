package com.kryptkode.recounter.counter

import com.kryptkode.recounter.redux.Reducer

val counterStateReducer : Reducer<CounterState>  = { oldState, action ->
    when(action){
        CounterAction.Init ->  CounterState()
        CounterAction.Decrement -> oldState.copy(count = oldState.count - 1)
        CounterAction.Increment -> oldState.copy(count = oldState.count + 1)
        else -> oldState
    }
}
