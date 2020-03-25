package com.example.tripvendor.main.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyUtil {

    public static final String ENGLISH = "en";
    public static final String US = "us";
    public static final String STANDARD_FORMAT = "$";
    public static final String SPACED_FORMAT = "$ ";

    public static String formatCurrencyToUS(BigDecimal value) {
        NumberFormat currencyInstance = DecimalFormat.getCurrencyInstance(new Locale(ENGLISH, US));
        return currencyInstance.format(value).replace(STANDARD_FORMAT, SPACED_FORMAT);
    }

}
