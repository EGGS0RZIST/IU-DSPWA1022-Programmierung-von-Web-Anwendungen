package org.iu.dspwa1022.oop.ControlFlow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.iu.dspwa1022.oop.lib.Day;

public class SwitchTest {

    @Test
    void monday() {
        assertEquals(6, Switch.getNumberOfLettersInDay(Day.MONDAY));
    }

    @Test
    void tuesday() {
        assertEquals(7, Switch.getNumberOfLettersInDay(Day.TUESDAY));
    }

    @Test
    void wednesday() {
        assertEquals(9, Switch.getNumberOfLettersInDay(Day.WEDNESDAY));
    }

    @Test
    void thursday() {
        assertEquals(8, Switch.getNumberOfLettersInDay(Day.THURSDAY));
    }

    @Test
    void friday() {
        assertEquals(6, Switch.getNumberOfLettersInDay(Day.FRIDAY));
    }

    @Test
    void saturday() {
        assertEquals(8, Switch.getNumberOfLettersInDay(Day.SATURDAY));
    }

    @Test
    void sunday() {
        assertEquals(6, Switch.getNumberOfLettersInDay(Day.SUNDAY));
    }
}
