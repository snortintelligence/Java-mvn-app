package com.snort.intelli.app.util.service;

import com.snort.intelli.app.util.Calculator;

public class CalculatorService implements Calculator {
    /**
     * @param a
     * @param b
     * @return
     */
    @Override
    public double add(double a, double b) {
        return a+b;
    }

    /**
     * @param a
     * @param b
     * @return
     */
    @Override
    public double subtract(double a, double b) {
        return a-b;
    }

    /**
     * @param a
     * @param b
     * @return
     */
    @Override
    public double multiply(double a, double b) {
        return a*b;
    }

    /**
     * @param a
     * @param b
     * @return
     */
    @Override
    public double division(double a, double b) {
        return b > 0 ?  a/b : 0;
    }

    /**
     * @param a
     * @param b
     * @return
     */
    @Override
    public double modulus(double a, double b) {
        return a%b;
    }
}
