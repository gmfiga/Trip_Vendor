package com.example.tripvendor.main.util;

public class DaysUtil {

    public static final String PLURAL = " days";
    public static final String SINGULAR = " day";

    public static String formatText(int numberOfDays) {
        if (numberOfDays > 1){
            return numberOfDays + PLURAL;
        }
        return numberOfDays + SINGULAR;
    }
}
