package com.budgetmanagement.models;

public class Dashboard {
    private double totalBudget;

    public Dashboard() {
        this.totalBudget = 0.0;
    }

    public double getTotalBudget() {
        return totalBudget;
    }

    public void setTotalBudget(double totalBudget) {
        this.totalBudget = totalBudget;
    }

    // Add other methods as needed for business logic
}
