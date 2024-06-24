package challenges.ControlFlow;

import challenges.lib.Day;

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
