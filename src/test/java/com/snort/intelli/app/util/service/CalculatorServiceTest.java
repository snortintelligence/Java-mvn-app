package com.snort.intelli.app.util.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    void add() {
        assertEquals(calculatorService.add(10d,1d), 11d);
    }

    @Test
    void subtract() {
        assertEquals(calculatorService.subtract(10d,1d), 9d);
    }

    @Test
    void multiply() {
        assertEquals(calculatorService.multiply(10d,1d), 10d);
    }

    @Test
    void division() {
        assertEquals(calculatorService.division(10d,2d), 5d);
    }

    @Test
    void modulus() {
        assertEquals(calculatorService.modulus(11d,2), 1d);
    }
}