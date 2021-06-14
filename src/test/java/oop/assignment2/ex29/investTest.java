package oop.assignment2.ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class investTest {
    /*
    What do you test?

    test edge cases - inputs, exceptions
    test calculations, decimals

    test common cases
    test uncommon cases
     */
    @Test
    void investmentCalculator_returns_correct_value_set_1() {
        // given
        invest rate = new invest();

        //when
        String actual = rate.investmentCalculator(4);

        //then
        assertEquals(18, actual);
    }

    @Test
    void investmentCalculator_returns_correct_value_set_2() {
        // given
        invest rate = new invest();

        //when
        String actual = rate.investmentCalculator(5);

        //then
        assertEquals(14.4, actual);
    }
}