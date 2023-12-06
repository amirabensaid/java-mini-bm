package com.budgetmanagement.controllers;

import com.budgetmanagement.models.Dashboard;
import com.budgetmanagement.views.DashboardView;

public class DashboardController {
    private Dashboard model;  // Reference to the model
    private IncomeController incomeController;
    private ExpenseController expenseController;
    private JournalController journalController;
    private DashboardView dashboardView;

    public DashboardController(Dashboard model, IncomeController incomeController, ExpenseController expenseController, JournalController journalController) {
        this.model = model;
        this.incomeController = incomeController;
        this.expenseController = expenseController;
        this.journalController = journalController;
        // Implement other initialization logic as needed
    }

    public IncomeController getIncomeController() {
        return incomeController;
    }

    public ExpenseController getExpenseController() {
        return expenseController;
    }

    public JournalController getJournalController() {
        return journalController;
    }

    public void setDashboardView(DashboardView dashboardView) {
        this.dashboardView = dashboardView;
    }

    public void updateTotalBudget(double newBudget) {
        model.setTotalBudget(newBudget);
        dashboardView.updateTotalBudgetLabel(newBudget);
    }

    // Add other methods for handling dashboard logic

    // For example:
    // public void handleAddIncome(double incomeAmount) {
    //     double currentBudget = model.getTotalBudget();
    //     double newBudget = currentBudget + incomeAmount;
    //     updateTotalBudget(newBudget);
    // }
}
