package com.java.calculator.resources.views;

import javax.swing.*;

final public class MainView extends JFrame {
    private JPanel mainPanel;
    private JLabel meta;
    private JTextField display;
    private JRadioButton OFFRadioButton;
    private JButton dButton;
    private JButton cButton;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a0Button;
    private JButton radixPoint;
    private JButton eButton;
    private JButton addButton;
    private JButton subButton;
    private JButton mulButton;
    private JButton divButton;

    public MainView() {
        initProperties();
        getContentPane().add(mainPanel);
    }

    private void initProperties() {
        setTitle("CALCULATOR");

        setLocation(350, 150);
        setSize(250, 300);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setResizable(false);
        setFocusable(true);
        setVisible(true);
    }
}
