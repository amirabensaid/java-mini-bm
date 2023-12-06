package com.budgetmanagement.controllers;

import com.budgetmanagement.models.Expense;
import com.budgetmanagement.views.ExpenseView;

public class ExpenseController {
    private Expense model;
    private ExpenseView view;  // Reference to the model
    // Add other necessary references

    public ExpenseController(Expense model) {
        this.model = model;
        // Initialize other references as needed
    }
    
    public void setExpenseView(ExpenseView view) {
        this.view = view;
    }
    
    public void setExpenseData(String category, double amount) {
        model.setCategory(category);
        model.setAmount(amount);
    }

    public void handleSaveButton() {
        if (model.saveExpense()) {
            // Add logic for successful save
        } else {
            // Add logic for failed save
        }
    }
    

    // Getter for Expense model
    public Expense getExpenseModel() {
        return model;
    }
}
