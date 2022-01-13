package com.java.calculator.app.models;

public class MainModel {
    private boolean isError;
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
        if (changedSign(op)) {
            return;
        }

        calculate();
        this.operator = String.valueOf(op);
        meta = result + operator;
        this.result = "0";
    }

    private boolean changedSign(char op) {
        if (this.meta != null && result.equals("0")) {
            meta = meta.replace(meta.charAt(meta.length() - 1), op);
            return false;
        }

        if (this.meta == null && op == '-') {
            if (result.equals("0")) {
                result = "-0";
                return true;
            }
            if (result.equals("-0")) {
                result = "0";
                return true;
            }
        }

        return false;
    }

    public void calculate() {
        if (isError) {
            return;
        }

        if (meta == null) {
            return;
        }

        try {
            String operand = meta.substring(0, meta.length() - 1);
            meta += result;
            doTheMath(Double.parseDouble(operand));
        } catch (NumberFormatException | ArithmeticException e) {
            enterErrorMode();
        }
    }

    private void doTheMath(double operand) {
        double answer = 0.0;
        double display = Double.parseDouble(result);

        switch (operator) {
            case "+":
                answer = operand + display;
                break;
            case "-":
                answer = operand - display;
                break;
            case "×":
                answer = operand * display;
                break;
            case "÷":
                answer = operand / display;
                break;
        }

        result = String.valueOf(answer);
    }

    public void backspace() {
        if (!result.isEmpty()) {
            result = result.substring(0, result.length() - 1);
        }
        if (result.isEmpty()) {
            result = "0";
        }
    }

    private void reset() {
        result = "0";
        operator = null;
        isError = false;
    }

    private void enterErrorMode() {
        result = "Error!";
        operator = null;
        isError = true;
    }
}
