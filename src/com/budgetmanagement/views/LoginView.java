// LoginView.java
package com.budgetmanagement.views;

import com.budgetmanagement.controllers.LoginController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private LoginController controller;

    public LoginView(LoginController controller) {
        this.controller = controller;
        initialize();
    }

    public LoginView() {
		// TODO Auto-generated constructor stub
	}

	private void initialize() {
        frame = new JFrame("Login");
        frame.setBounds(100, 100, 400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleLoginButton();
            }
        });

        JButton btnShowRegister = new JButton("Show Register");
        btnShowRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showRegister();
            }
        });

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.add(btnLogin);
        buttonPanel.add(btnShowRegister);

        frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    private void handleLoginButton() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        controller.setUserData(username, password);
        controller.handleLoginButton();
    }

    public void showDashboard() {
        JOptionPane.showMessageDialog(frame, "Redirecting to Dashboard");
    }

    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(frame, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public RegisterView getRegisterView() {
        return controller.getRegisterController().getView();
    }

    public void showRegister() {
        frame.dispose();
        RegisterView registerView = getRegisterView();
        registerView.setController(controller.getRegisterController());
        registerView.show();
    }

    public void setController(LoginController controller) {
        this.controller = controller;
    }

    public void show() {
        frame.setVisible(true);
    }

    public LoginController getController() {
        return controller;
    }

    public Component getFrame() {
        return frame;
    }

    public void setRegisterView(RegisterView registerView) {
        // TODO Auto-generated method stub

    }
}
