// RegisterView.java
package com.budgetmanagement.views;

import com.budgetmanagement.controllers.RegisterController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterView {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private RegisterController controller;

    public RegisterView(RegisterController controller) {
        this.controller = controller;
        initialize();
    }

    public RegisterView() {
        // TODO: Add any additional initialization if needed
    }

    private void initialize() {
        frame = new JFrame("Register");
        frame.setBounds(100, 100, 400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(2, 2));

        JLabel lblUsername = new JLabel("Username:");
        inputPanel.add(lblUsername);

        usernameField = new JTextField();
        inputPanel.add(usernameField);

        JLabel lblPassword = new JLabel("Password:");
        inputPanel.add(lblPassword);

        passwordField = new JPasswordField();
        inputPanel.add(passwordField);

        frame.getContentPane().add(inputPanel, BorderLayout.CENTER);

        JButton btnRegister = new JButton("Register");
        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleRegisterButton();
            }
        });
        frame.getContentPane().add(btnRegister, BorderLayout.SOUTH);

        JButton btnShowLogin = new JButton("Show Login");
        btnShowLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showLogin();
            }
        });
        frame.getContentPane().add(btnShowLogin, BorderLayout.SOUTH);
    }

    private void handleRegisterButton() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        controller.setUserData(username, password);
        controller.handleRegisterButton();
    }

    public void showLogin() {
        frame.dispose();
        controller.showLogin();
    }

    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(frame, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void show() {
        frame.setVisible(true);
    }

    public void setController(RegisterController controller) {
        this.controller = controller;
    }

    public JFrame getFrame() {
        return frame;
    }
}
