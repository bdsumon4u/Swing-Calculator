package com.java.calculator.resources.views;

import javax.swing.*;

final public class MainView extends JFrame {
    private JPanel mainPanel;

    public MainView() {
        initProperties();
    }

    private void initProperties() {
        setTitle("CALCULATOR");

        setLocation(350, 150);
        setSize(350, 550);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setResizable(false);
        setFocusable(true);
        setVisible(true);
    }
}
