package com.kryptkode.recounter.redux

interface Store <S: State> {
  fun dispatch(action: Action)
  fun add(subscriber: StoreSubscriber<S>): Boolean
  fun remove(subscriber: StoreSubscriber<S>): Boolean
  fun getCurrentState(): S
}