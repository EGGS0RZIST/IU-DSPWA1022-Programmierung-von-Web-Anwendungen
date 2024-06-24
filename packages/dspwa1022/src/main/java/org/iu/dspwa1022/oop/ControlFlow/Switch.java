package org.iu.dspwa1022.oop.ControlFlow;

import org.iu.dspwa1022.oop.lib.Day;

public class Switch {

    public static int getNumberOfLettersInDay(Day day) {
        switch (day) {
            case MONDAY, FRIDAY, SUNDAY:
                return 6;
            case TUESDAY:
                return 7;
            case THURSDAY, SATURDAY:
                return 8;
            case WEDNESDAY:
                return 9;
            default:
                return 0;
        }
    }

}
