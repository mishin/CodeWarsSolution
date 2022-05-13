package com.streams.kata;

import org.junit.Test;

import static com.streams.kata.KataStream.createPhoneNumber;
import static org.junit.Assert.assertEquals;

public class PhoneExampleTests {
    @Test
    public void tests() {
        assertEquals("(123) 456-7890", createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}