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
        view.addKeyListener(new KeyController(this));
    }

    private void bindButtons() {
        for (int i = 0; i < view.numButtons().size(); i++) {
            final int buttonID = i;
            view.numButtons().get(i).addActionListener(e -> pressNum(buttonID));
        }
    }

    protected void pressNum(int num) {
        System.out.println("Pressed " + num);
    }
}
