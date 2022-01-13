package com.java.calculator.app.controllers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyController implements KeyListener {
    MainController controller;

    public KeyController(MainController controller) {
        this.controller = controller;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                controller.pressNum((int)e.getKeyChar() - (int)'0');
                break;
            case '+':
                controller.pressOperator('+');
                break;
            case '-':
                controller.pressOperator('-');
                break;
            case '*':
                controller.pressOperator('×');
                break;
            case '/':
                controller.pressOperator('÷');
                break;
            case '=':
                controller.pressEqualButton();
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_BACK_SPACE:
                controller.pressBackButton();
                break;
        }
    }
}
