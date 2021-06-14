package oop.assignment2.ex25.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordStrengthTest {
    /*
    What do you test?

    test edge cases - letters, numbers, special characters
    test level

    test common cases
    test uncommon cases
     */
    @Test
    void passwordValidator_returns_1_for_pass_set_1() {
        // given
        passwordStrength password = new passwordStrength();

        // when
        int actual = password.passwordValidator("12345");

        // then
        assertEquals(1, actual);
    }

    @Test
    void passwordValidator_returns_1_for_pass_set_2() {
        // given
        passwordStrength password = new passwordStrength();

        // when
        int actual = password.passwordValidator("3046981");

        // then
        assertEquals(1, actual);
    }

    @Test
    void passwordValidator_returns_2_for_pass_set_1() {
        // given
        passwordStrength password = new passwordStrength();

        // when
        int actual = password.passwordValidator("abcdef");

        // then
        assertEquals(2, actual);
    }

    @Test
    void passwordValidator_returns_2_for_pass_set_2() {
        // given
        passwordStrength password = new passwordStrength();

        // when
        int actual = password.passwordValidator("*$%}!$");

        // then
        assertEquals(2, actual);
    }

    @Test
    void passwordValidator_returns_3_for_pass_set_1() {
        // given
        passwordStrength password = new passwordStrength();

        // when
        int actual = password.passwordValidator("1562879403");

        // then
        assertEquals(3, actual);
    }

    @Test
    void passwordValidator_returns_3_for_pass_set_2() {
        // given
        passwordStrength password = new passwordStrength();

        // when
        int actual = password.passwordValidator("the entire alphabet");

        // then
        assertEquals(3, actual);
    }

    @Test
    void passwordValidator_returns_3_for_pass_set_3() {
        // given
        passwordStrength password = new passwordStrength();

        // when
        int actual = password.passwordValidator("~!@#$%^&*()");

        // then
        assertEquals(3, actual);
    }

    @Test
    void passwordValidator_returns_3_for_pass_set_4() {
        // given
        passwordStrength password = new passwordStrength();

        // when
        int actual = password.passwordValidator("(%&^%(!&*%^!%&*)#%)^)");

        // then
        assertEquals(3, actual);
    }

    @Test
    void passwordValidator_returns_4_for_pass_set_1() {
        // given
        passwordStrength password = new passwordStrength();

        // when
        int actual = password.passwordValidator("abc123xyz");

        // then
        assertEquals(4, actual);
    }

    @Test
    void passwordValidator_returns_4_for_pass_set_2() {
        // given
        passwordStrength password = new passwordStrength();

        // when
        int actual = password.passwordValidator("(#2$5^)73&016@98%4*!");

        // then
        assertEquals(4, actual);
    }

    @Test
    void passwordValidator_returns_5_for_pass_set_1() {
        // given
        passwordStrength password = new passwordStrength();

        // when
        int actual = password.passwordValidator("1337h@xor!");

        // then
        assertEquals(5, actual);
    }

    @Test
    void passwordValidator_returns_5_for_pass_set_2() {
        // given
        passwordStrength password = new passwordStrength();

        // when
        int actual = password.passwordValidator("aL}\\~`E'G\\5'tcJ^");

        // then
        assertEquals(5, actual);
    }
}