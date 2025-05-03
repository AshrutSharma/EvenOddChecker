package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenOddCheckerTest {

    @Test
    void testEvenNumber() {
        assertEquals("Even", EvenOddChecker.checkEvenOdd(4));
    }

    @Test
    void testOddNumber() {
        assertEquals("Odd", EvenOddChecker.checkEvenOdd(5));
    }
}
