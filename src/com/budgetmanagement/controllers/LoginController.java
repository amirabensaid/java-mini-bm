// LoginController.java
package com.budgetmanagement.controllers;

import com.budgetmanagement.models.User;
import com.budgetmanagement.views.LoginView;
import com.budgetmanagement.views.RegisterView;

import javax.swing.*;

public class LoginController {
    private User user;
    private LoginView view;
    private RegisterController registerController;

    public LoginController(User user, LoginView view) {
        this.user = user;
        this.view = view;
        this.view.setController(this);
    }

    public void authenticateUser(String username, String password) {
        if (user.authenticate(password)) {
            view.showDashboard();
        } else {
            view.showErrorMessage("Invalid credentials");
        }
    }

    public void showRegister() {
        view.showRegister();
    }

    public RegisterController getRegisterController() {
        return new RegisterController(new User(), new RegisterView());
    }

    public void setUserData(String username, String password) {
        user.setUsername(username);
        user.setPassword(password);
    }

    public void handleLoginButton() {
        // Logic to check user credentials
        if (user.checkCredentials()) {
            view.showDashboard();
        } else {
            view.showErrorMessage("Invalid credentials");
        }
    }

    public void showDashboard() {
        // Example implementation to show the dashboard
        JOptionPane.showMessageDialog(view.getFrame(), "Redirecting to Dashboard");
    }

    public LoginView getView() {
        return view;
    }

    public void setView(LoginView view) {
        this.view = view;
        if (view != null) {
            view.setController(this);
        }
    }

    public void setRegisterController(RegisterController registerController) {
        this.registerController = registerController;
    }
}
