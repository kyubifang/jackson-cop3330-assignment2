package oop.assignment2.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {
    /*
    What do you test?

    test edge cases - 0, 1, very large numbers, very small numbers
    test both true and false cases

    test common cases
    test uncommon cases
     */

    @Test
    void isAnagram_returns_true_for_anagrams_set1() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("difo", "fido");

        // then
        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_true_for_anagrams_set2() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("note", "tone");

        // then
        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_true_for_anagrams_set3() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("Tom Marvolo Riddle ", "I am Lord Voldemort");

        // then
        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_false_for_nonanagrams_set1() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("difo", "god");

        //then
        assertFalse(actual);
    }

    @Test
    void isAnagram_returns_false_for_nonanagrams_set2() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("difo", "dogo");

        //then
        assertFalse(actual);
    }

    @Test
    void isAnagram_returns_false_for_nonanagrams_set3() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("I am Tom Riddle", "I am Lord Voldemort");

        //then
        assertFalse(actual);
    }
}