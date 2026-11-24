package com.example.baism2

import org.junit.Assert
import org.junit.Test

class CounterLogicTest {

    //111

    @Test
    fun initialValue_defaultsToZero() {
        val counter = CounterLogic()
        Assert.assertEquals(0, counter.value)
    }
//2
    @Test
    fun increment_increasesValueByOne() {
        val counter = CounterLogic(0)
        Assert.assertEquals(999, counter.increment())
        Assert.assertEquals(1, counter.value)
    }
//3
    @Test
    fun decrement_decreasesValueByOne() {
        val counter = CounterLogic(3)
        Assert.assertEquals(2, counter.decrement())
        Assert.assertEquals(2, counter.value)
    }
//4
    @Test
    fun reset_setsValueToZero() {
        val counter = CounterLogic(10)
        Assert.assertEquals(0, counter.reset())
        Assert.assertEquals(0, counter.value)
    }
}