package com.test_project;

import javax.swing.JButton;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Test GUI");
        frame.setSize(300, 320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create button
        JButton button = new JButton("Click me");
        button.setBounds(100, 70, 100, 30); // x, y, width, height
        frame.add(button);

        // Show frame
        frame.setVisible(true);
    }
}