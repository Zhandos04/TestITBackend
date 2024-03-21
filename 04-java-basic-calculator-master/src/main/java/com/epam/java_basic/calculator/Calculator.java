package com.epam.java_basic.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
    private int precision;

    public Calculator(int precision) {
        this.precision = precision;
    }

    public double add(double a, double b) {
        double number = a + b;
        double rounded = Math.round(number * Math.pow(10, precision)) / Math.pow(10, precision);
        return rounded;
    }

    public double subtract(double a, double b) {
        double number = a - b;
        double rounded = Math.round(number * Math.pow(10, precision)) / Math.pow(10, precision);
        return rounded;
    }

    public double multiply(double a, double b) {
        double number = a * b;
        double rounded = Math.round(number * Math.pow(10, precision)) / Math.pow(10, precision);
        return rounded;
    }

    public double div(double a, double b) {
        double number = a / b;
        double rounded = Math.round(number * Math.pow(10, precision)) / Math.pow(10, precision);
        return rounded;
    }

}
