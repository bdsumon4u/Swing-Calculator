package com.java.calculator.app.controllers;

import com.java.calculator.app.models.MainModel;
import com.java.calculator.resources.views.MainView;

public class MainController {
    MainModel model;
    MainView view;

    public MainController(MainModel model, MainView view) {
        this.model = model;
        this.view = view;

        bindButtons();
        updateDisplay();
        view.addKeyListener(new KeyController(this));
    }

    private void bindButtons() {
        for (int i = 0; i < view.numButtons().size(); i++) {
            final int buttonID = i;
            view.numButtons().get(i).addActionListener(e -> pressNum(buttonID));
        }

        view.getAddButton().addActionListener(e -> pressOperator('+'));
        view.getSubButton().addActionListener(e -> pressOperator('-'));
        view.getMulButton().addActionListener(e -> pressOperator('×'));
        view.getDivButton().addActionListener(e -> pressOperator('÷'));

        view.getEqualButton().addActionListener(e -> pressEqualButton());
    }

    protected void pressNum(int num) {
        model.insertNum(num);
        updateDisplay();
    }

    protected void pressOperator(char op) {
        model.setOperator(op);
        updateDisplay();
    }

    protected void pressEqualButton() {
        model.calculate();
        updateDisplay();
    }

    private void updateDisplay() {
        view.setDisplay(model.getResult());
        view.setDisplayMeta(model.getMeta());
    }
}
