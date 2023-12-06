package com.budgetmanagement.controllers;

import com.budgetmanagement.models.Income;
import com.budgetmanagement.views.IncomeView;

public class IncomeController {
    private Income model;  // Reference to the model
    private IncomeView view; // Add other necessary references

    public IncomeController(Income model) {
        this.model = model;
        // Initialize other references as needed
    }
    public void setIncomeView(IncomeView view) {
        this.view = view;
    }
    public void setIncomeData(String category, double amount) {
        model.setCategory(category);
        model.setAmount(amount);
    }

    public void handleSaveButton() {
        if (model.saveIncome()) {
            // Add logic for successful save
        } else {
            // Add logic for failed save
        }
    }

    // Getter for Income model
    public Income getIncomeModel() {
        return model;
    }
}
