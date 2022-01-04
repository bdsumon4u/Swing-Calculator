package com.java.calculator;

import com.java.calculator.app.controllers.MainController;
import com.java.calculator.app.models.MainModel;
import com.java.calculator.resources.views.MainView;

public class Main {

    public static void main(String[] args) {
        new MainController(new MainModel(), new MainView());
    }
}
