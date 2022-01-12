package com.java.calculator.app.models;

public class MainModel {
    private String result;

    private final static int MAX_INPUT_DIGITS = 12;

    public MainModel() {
        reset();
    }

    public String getResult() {
        return result;
    }

    public void insertNum(int num) {
        // We don't want to go over the limit of the display
        if (result.length() >= MAX_INPUT_DIGITS) {
            return;
        }
        if (result.equals("0")) {
            result = String.valueOf(num);
            return;
        }
        if (result.equals("-0")) {
            result = "-" + num;
            return;
        }
        result += num;
    }

    private void reset() {
        result = "0";
    }
}
