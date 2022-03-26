package com.twotoone
import org.junit.Test

import org.junit.Assert.assertEquals

internal class Multiplication_Test {
    @Test
    @Throws(Exception::class)
    fun test_Associativity_Of_Multiplication() {
        for (i in 0..99) {
            val a = Math.random()
            val b = Math.random()
            val c = Math.random()
            val message = String.format("(%g * %g) * %g == %g * (%g * %g)", a, b, c, a, b, c)
            assertEquals(message,
                multiply(multiply(a, b), c),
                multiply(a, multiply(b, c)),
                1E-14)
            assertEquals(multiply(a, b), a * b, 1e-3);
        }
    }
}