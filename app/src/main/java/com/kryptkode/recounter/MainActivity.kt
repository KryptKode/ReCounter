package com.kryptkode.recounter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kryptkode.recounter.counter.CounterAction
import com.kryptkode.recounter.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val binding : ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        DI.store.dispatch(action = CounterAction.Init)

        binding.addBtn.setOnClickListener {
            DI.store.dispatch(action = CounterAction.Increment)
        }

        binding.removeBtn.setOnClickListener {
            DI.store.dispatch(action = CounterAction.Decrement)
        }

        DI.store.add {
            binding.counterText.text = it.count.toString()
        }
    }
}