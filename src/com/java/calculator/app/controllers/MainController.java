package com.java.calculator.app.controllers;

import com.java.calculator.app.models.MainModel;
import com.java.calculator.resources.views.MainView;

public class MainController {
    MainModel model;
    MainView view;

    public MainController(MainModel model, MainView view) {
        this.model = model;
        this.view = view;

        System.out.println("MainController");
    }
}
