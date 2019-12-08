package com.epam.forTests;

public class MathApp {
    private Calculator calculator;

    public MathApp() {
    }

    public MathApp(Calculator calculator) {
        this.calculator = calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public int add(int value1, int value2) {
        return calculator.add(value1, value2);
    }

    public int subtract(int value1, int value2) {
        return calculator.subtract(value1, value2);
    }

    public int multiply(int value1, int value2) {
        return calculator.multiply(value1, value2);
    }

    public double divide(int value1, int value2) {
        return calculator.divide(value1, value2);
    }
}
