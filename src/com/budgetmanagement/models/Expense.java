package com.budgetmanagement.models;

public class Expense {
    private String category;
    private double amount;

    public Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean saveExpense() {
        // Add logic to save expense data to the database
        return true;  // For simplicity, always return true in this example
    }

    // Add other methods as needed for business logic
}
