package com.java.calculator.app.models;

public class MainModel {
    private String operator;
    private String result;
    private String meta;

    private final static int MAX_INPUT_DIGITS = 12;

    public MainModel() {
        reset();
    }

    public String getResult() {
        return result;
    }

    public String getMeta() {
        return meta;
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

    public void setOperator(char op) {
        this.operator = String.valueOf(op);
        meta = result + operator;
        this.result = "0";
    }

    private void reset() {
        result = "0";
        operator = null;
    }
}
