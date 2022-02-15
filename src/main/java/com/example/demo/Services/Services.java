package com.example.demo.Services;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Services {

    public boolean isFriday() {
        /*
        Jeg havde dsv. travlt i dag og nåede ikke rigtig frem til noget konkret svar.
        Jeg havde måske tænkt at metoden skulle være en boolean, der så returned false eller true
        alt efter et if-statement med DayOfWeek.
         */

        LocalDate date = LocalDate.now();
        DayOfWeek weekDay = date.getDayOfWeek();

        if (weekDay.equals(DayOfWeek.FRIDAY)) {
            return true;
        } else {
            return false;
        }
    }
}
