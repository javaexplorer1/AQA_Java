package ru.astondev;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void testFactorialException() {
        assertThrows(IllegalArgumentException.class, () -> App.factorial(-10));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 0",
            "1, 1",
            "120, 5"})
    void testFactorialParam(long factorialValue, int number) {
        assertEquals(factorialValue, App.factorial(number));
    }
}
