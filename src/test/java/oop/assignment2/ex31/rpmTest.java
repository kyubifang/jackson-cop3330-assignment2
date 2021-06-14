package oop.assignment2.ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class rpmTest {

    @Test
    void restingHeartRate_outputs_correct_value_set_1() {
        //given
        rpm pulse = new rpm();

        //when
        String actual = pulse.restingHeartRate(65, 22);

        //then
        assertEquals("""
                55%          | 138 bpm
                60%          | 145 bpm
                65%          | 151 bpm
                70%          | 158 bpm
                75%          | 165 bpm
                80%          | 171 bpm
                85%          | 178 bpm
                90%          | 185 bpm
                95%          | 191 bpm""", actual);
    }

    @Test
    void restingHeartRate_outputs_correct_value_set_2() {
        //given
        rpm pulse = new rpm();

        //when
        String actual = pulse.restingHeartRate(72, 34);

        //then
        assertEquals("""
                55%          | 135 bpm
                60%          | 140 bpm
                65%          | 146 bpm
                70%          | 152 bpm
                75%          | 158 bpm
                80%          | 163 bpm
                85%          | 169 bpm
                90%          | 175 bpm
                95%          | 180 bpm""", actual);
    }
}