// RegisterController.java
package com.budgetmanagement.controllers;

import com.budgetmanagement.models.User;
import com.budgetmanagement.views.LoginView;
import com.budgetmanagement.views.RegisterView;

public class RegisterController {
    private User user;
    private RegisterView view;

    public RegisterController(User user, RegisterView view) {
        this.user = user;
        this.view = view;
        this.view.setController(this);
    }

    public void handleRegisterButton() {
        // Logic to register the user
        // For simplicity, always return true in this example
        boolean registrationSuccessful = true;

        if (registrationSuccessful) {
            view.showLogin();
        } else {
            view.showErrorMessage("Registration failed");
        }
    }

    public LoginController getLoginController() {
        // Assuming you have a method to create a new user
        User newUser = new User();
        LoginView loginView = new LoginView(new LoginController(newUser, null));
        return loginView.getController();
    }

    public RegisterView getView() {
        return view;
    }

    public void setView(RegisterView view) {
        this.view = view;
        if (view != null) {
            view.setController(this);
        }
    }

    public void showLogin() {
        // Logic to show the login view
        LoginView loginView = getLoginController().getView();
        loginView.show();
    }

    public void setUserData(String username, String password) {
        user.setUsername(username);
        user.setPassword(password);
    }

    public void setRegisterView(RegisterView registerView) {
        this.view = registerView;
        if (registerView != null) {
            registerView.setController(this);
        }
    }

    // Add any other methods as needed
}
