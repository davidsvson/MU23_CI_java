package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest

    @CsvSource({
            "3, 5, 8",
            "0, 0 , 0",
            "2, -1, 1",
            "-1, -1, -2"
    }
    )

    void add(int a , int b, int expected ) {
        // given
        Calculator calc = new Calculator();

        //when
        int result = calc.add(a, b);

        //then
        assertEquals(expected, result);

    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Calculator calc = new Calculator();

        //when
        int result = calc.subtract(3, 5);

        //then
        assertEquals(-2, result);


    }
}