// Budget.java
package main;

import com.budgetmanagement.controllers.LoginController;
import com.budgetmanagement.controllers.RegisterController;
import com.budgetmanagement.models.User;
import com.budgetmanagement.views.LoginView;
import com.budgetmanagement.views.RegisterView;

public class Budget {

    public static void main(String[] args) {
        // Create a shared user model
        User userModel = new User();

        // Create LoginController and LoginView
        LoginController loginController = new LoginController(userModel, new LoginView());
        LoginView loginView = loginController.getView();

        // Create RegisterController and RegisterView
        RegisterController registerController = new RegisterController(userModel, new RegisterView());
        RegisterView registerView = registerController.getView();

        // Set references between controllers
        loginController.setRegisterController(registerController);

        // Set views for controllers
        loginController.setView(loginView);
        registerController.setRegisterView(registerView);
        loginView.setController(loginController);
        loginView.setRegisterView(registerView);

        // Show the login view
        loginView.show();
    }
}
