package ru.astondev;

import static org.testng.Assert.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class AppTest {
    public void testFactorialException() {
        assertThrows(IllegalArgumentException.class, () -> App.factorial(-10));
    }

    @DataProvider
    public Object[][] factorialParameters() {
        return new Object[][]{
                {0, 1},
                {1, 1},
                {5, 120},
        };
    }

    @Test(dataProvider = "factorialParameters")
    public void testFactorial(int number, long factorialValue) {
        assertEquals(App.factorial(number), factorialValue);
    }
}
