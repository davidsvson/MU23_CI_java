package org.example;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        // given
        Calculator calc = new Calculator();

        //when
        int result = calc.add(3, 5);

        //then
        assertEquals(8, result);

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