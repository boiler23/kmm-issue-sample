package com.example.kmmissuesample

import com.example.shared.Foo

import org.junit.Test
import org.junit.Assert.assertEquals

class TestWithFoo {
    @Test
    fun test() {
        val foo = Foo()
        assertEquals(1, foo.bar())
    }
}
