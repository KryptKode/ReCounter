package com.kryptkode.recounter.redux

class DefaultStore<S : State>(
    initialState: S,
    private val reducer: Reducer<S>
) : Store<S> {

    private val subscribers = mutableSetOf<StoreSubscriber<S>>()
    private var state: S = initialState
        set(value) {
            // update state
            field = value

            // notify all subscribers
            subscribers.forEach { it(value) }
        }

    override fun add(subscriber: StoreSubscriber<S>) = subscribers.add(subscriber)

    override fun dispatch(action: Action) {
        // use reducer to create new state
        state = reducer(state, action)
    }

    override fun remove(subscriber: StoreSubscriber<S>) = subscribers.remove(subscriber)

    override fun getCurrentState() = state
}