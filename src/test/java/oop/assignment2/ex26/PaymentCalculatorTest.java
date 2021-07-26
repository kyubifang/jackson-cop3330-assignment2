package oop.assignment2.ex26;

import oop.assignment2.ex25.base.passwordStrength;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    @Test
    void calculateMonthsUntilPaidOff_returns_correct_payment_1(){
        // given
        PaymentCalculator apr = new PaymentCalculator();

        // when
        String actual = apr.calculateMonthsUntilPaidOff(5000, 12, 100);

        // then
        assertEquals(70, actual);
    }
}