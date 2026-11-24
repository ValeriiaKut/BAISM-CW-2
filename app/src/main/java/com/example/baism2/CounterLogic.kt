package com.example.baism2

class CounterLogic(initialValue: Int = 0) {
    var value: Int = initialValue
        private set

    fun increment(): Int {
        value += 1
        return value
    }

    fun decrement(): Int {
        value -= 1
        return value
    }

    fun reset(): Int {
        value = 0
        return value
    }
}