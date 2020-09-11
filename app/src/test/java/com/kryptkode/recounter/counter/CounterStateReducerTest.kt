package com.kryptkode.recounter.counter

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class CounterStateReducerTest {

    @Test
    fun `counterStateReducer will return an incremented CounterState for the Increment action`() {
        val oldState = CounterState(3)
        val action = CounterAction.Increment

        val newState = counterStateReducer.invoke(oldState, action)

        assertThat(CounterState(4), `is`(newState))
    }

    @Test
    fun `counterStateReducer will return an decremented CounterState for the Decrement action`() {
        val oldState = CounterState(3)
        val action = CounterAction.Decrement

        val newState = counterStateReducer.invoke(oldState, action)

        assertThat(CounterState(2), `is`(newState))
    }
}