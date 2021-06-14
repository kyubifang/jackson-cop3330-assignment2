package oop.assignment2.ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    /*
    What do you test?

    test inputs
    test addition
    test total

    test common cases
    test uncommon cases
     */
    @Test
    void calculation_returns_correct_total_set_1() {
        // given
        Calculator add = new Calculator();

        //when
        double actual = add.calculation(1 + 2 + 3 + 4 + 5);

        //then
        assertEquals(15, actual);
    }

    @Test
    void calculation_returns_correct_total_set_2() {
        // given
        Calculator add = new Calculator();

        //when
        double actual = add.calculation(17+29+54+103+8);

        //then
        assertEquals(211, actual);
    }

    @Test
    void calculation_returns_correct_total_set_3() {
        // given
        Calculator add = new Calculator();

        //when
        double actual = add.calculation(9.8+5.1+3+8+26);

        //then
        assertEquals(51.9, actual);
    }

    @Test
    void calculation_returns_correct_total_set_4() {
        // given
        Calculator add = new Calculator();

        //when
        double actual = add.calculation(50.5+20.2+4.3+2.0+9.0);

        //then
        assertEquals(86, actual);
    }
}