package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {

    @Test
    void testSquareRoot() {
        assertEquals(4.0, ScientificCalculator.squareRoot(16), 0.001);
        assertEquals(5.0, ScientificCalculator.squareRoot(25), 0.001);
        assertThrows(IllegalArgumentException.class, () -> ScientificCalculator.squareRoot(-1));
    }

    @Test
    void testFactorial() {
        assertEquals(120, ScientificCalculator.factorial(5));
        assertEquals(1, ScientificCalculator.factorial(0));
        assertThrows(IllegalArgumentException.class, () -> ScientificCalculator.factorial(-5));
    }

    @Test
    void testNaturalLog() {
        assertEquals(0.0, ScientificCalculator.naturalLog(1), 0.001);
        assertThrows(IllegalArgumentException.class, () -> ScientificCalculator.naturalLog(0));
    }

    @Test
    void testPower() {
        assertEquals(8.0, ScientificCalculator.power(2, 3), 0.001);
        assertEquals(1.0, ScientificCalculator.power(5, 0), 0.001);
    }
}
