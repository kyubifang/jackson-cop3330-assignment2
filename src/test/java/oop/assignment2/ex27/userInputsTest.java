package oop.assignment2.ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class userInputsTest {
    /*
    What do you test?

    test edge cases - first names, last names, zip codes, employee IDs
    test length of each, if correct format was entered

    test common cases
    test uncommon cases
     */
    @Test
    void validateInput_returns_first_name_error_set_1() {
        // given
        userInputs ui = new userInputs();

        // when
        String actual = ui.firstName("J");

        // then
        assertEquals("010", actual);
    }

    @Test
    void validateInput_returns_first_name_error_set_2() {
        // given
        userInputs ui = new userInputs();

        // when
        String actual = ui.firstName("John");

        // then
        assertEquals("000", actual);
    }

    @Test
    void validateInput_returns_first_name_error_set_3() {
        // given
        userInputs ui = new userInputs();

        // when
        String actual = ui.firstName("5");

        // then
        assertEquals("011", actual);
    }

    @Test
    void validateInput_returns_last_name_error_set_1() {
        // given
        userInputs ui = new userInputs();

        // when
        String actual = ui.lastName("");

        // then
        assertEquals("111", actual);
    }

    @Test
    void validateInput_returns_last_name_error_set_2() {
        // given
        userInputs ui = new userInputs();

        // when
        String actual = ui.lastName("Johnson");

        // then
        assertEquals("000", actual);
    }

    @Test
    void validateInput_returns_last_name_error_set_3() {
        // given
        userInputs ui = new userInputs();

        // when
        String actual = ui.lastName("9");

        // then
        assertEquals("011", actual);
    }

    @Test
    void validateInput_returns_zip_code_error_set_1() {
        // given
        userInputs ui = new userInputs();

        // when
        String actual = ui.zipCode("1he409");

        // then
        assertEquals("1", actual);
    }

    @Test
    void validateInput_returns_zip_code_error_set_2() {
        // given
        userInputs ui = new userInputs();

        // when
        String actual = ui.zipCode("ABCDE");

        // then
        assertEquals("1", actual);
    }

    @Test
    void validateInput_returns_zip_code_error_set_3() {
        // given
        userInputs ui = new userInputs();

        // when
        String actual = ui.zipCode("55555");

        // then
        assertEquals("0", actual);
    }

    @Test
    void validateInput_returns_employee_ID_error_set_1() {
        // given
        userInputs ui = new userInputs();

        // when
        String actual = ui.employeeID("487e23wobfgrt5hu");

        // then
        assertEquals("1", actual);
    }

    @Test
    void validateInput_returns_employee_ID_error_set_2() {
        // given
        userInputs ui = new userInputs();

        // when
        String actual = ui.employeeID("A12-1234");

        // then
        assertEquals("1", actual);
    }

    @Test
    void validateInput_returns_employee_ID_error_set_3() {
        // given
        userInputs ui = new userInputs();

        // when
        String actual = ui.employeeID("TK-4321");

        // then
        assertEquals("0", actual);
    }

    @Test
    void validateInput_returns_multiple_errors_set_1() {
        // given
        userInputs ui = new userInputs();

        // when
        String actual = ui.validateInput("010", "111", "1", "1");

        // then
        assertEquals("""
                The first name must be at least 2 characters long.
                The last name must be filled in.
                The last name must be at least 2 characters long.
                The last name must only consist of letters.
                The zipcode must be a 5 digit number.
                The employee ID must be in the format of AA-1234.""", actual);
    }

    @Test
    void validateInput_returns_multiple_errors_set_2() {
        // given
        userInputs ui = new userInputs();

        // when
        String actual = ui.validateInput("011", "001", "1", "0");

        // then
        assertEquals("""
                The first name must be at least 2 characters long.
                The first name must only consist of letters.
                The last name must only consist of letters.
                The zipcode must be a 5 digit number.""", actual);
    }

    @Test
    void validateInput_returns_multiple_errors_set_3() {
        // given
        userInputs ui = new userInputs();

        // when
        String actual = ui.validateInput("111", "010", "0", "1");

        // then
        assertEquals("""
                The first name must be filled in.
                The first name must be at least 2 characters long.
                The first name must only consist of letters.
                The last name must be at least 2 characters long.
                The employee ID must be in the format of AA-1234.""", actual);
    }

    @Test
    void validateInput_returns_multiple_errors_set_4() {
        // given
        userInputs ui = new userInputs();

        // when
        String actual = ui.validateInput("111", "111", "1", "1");

        // then
        assertEquals("""
                The first name must be filled in.
                The first name must be at least 2 characters long.
                The first name must only consist of letters.
                The last name must be filled in.
                The last name must be at least 2 characters long.
                The last name must only consist of letters.
                The zipcode must be a 5 digit number.
                The employee ID must be in the format of AA-1234.""", actual);
    }

    @Test
    void validateInput_returns_multiple_errors_set_5() {
        // given
        userInputs ui = new userInputs();

        // when
        String actual = ui.validateInput("000", "000", "0", "0");

        // then
        assertEquals("There were no errors found.", actual);
    }
}