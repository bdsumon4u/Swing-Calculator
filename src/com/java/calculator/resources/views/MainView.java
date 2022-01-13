package com.java.calculator.resources.views;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public List<JButton> numButtons() {
        return Arrays.asList(
                a0Button, a1Button, a2Button, a3Button, a4Button,
                a5Button, a6Button, a7Button, a8Button, a9Button
        );
    }

    public JButton getAddButton() {
        return addButton;
    }
    public JButton getSubButton() {
        return subButton;
    }
    public JButton getMulButton() {
        return mulButton;
    }
    public JButton getDivButton() {
        return divButton;
    }

    public JButton getEqualButton() {
        return eButton;
    }
    public JButton getBackButton() {
        return dButton;
    }

    public void setDisplay(String display) {
        this.display.setText(display);
    }
    public void setDisplayMeta(String meta) {
        this.meta.setText(meta);
    }
}
