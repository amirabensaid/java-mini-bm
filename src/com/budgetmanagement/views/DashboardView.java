package com.budgetmanagement.views;

import com.budgetmanagement.controllers.DashboardController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashboardView {
    private DashboardController controller;
    private JFrame frame;
    private JLabel totalBudgetLabel;

    public DashboardView(DashboardController controller) {
        this.controller = controller;
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Dashboard");
        frame.setBounds(100, 100, 300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(2, 1));

        totalBudgetLabel = new JLabel("Total Budget: $0.0");
        frame.getContentPane().add(totalBudgetLabel);

        JButton btnAddIncome = new JButton("Add Income");
        btnAddIncome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle the button click to add income
                // For example:
                // Create an instance of the IncomeView and show it
                IncomeView incomeView = new IncomeView(controller.getIncomeController());
                incomeView.show();
            }
        });
        frame.getContentPane().add(btnAddIncome);

        JButton btnAddExpense = new JButton("Add Expense");
        btnAddExpense.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle the button click to add expense
                // For example:
                // Create an instance of the ExpenseView and show it
                ExpenseView expenseView = new ExpenseView(controller.getExpenseController());
                expenseView.show();
            }
        });
        frame.getContentPane().add(btnAddExpense);

        JButton btnShowJournal = new JButton("Show Journal");
        btnShowJournal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle the button click to show the journal
                // For example:
                // Create an instance of the JournalView and show it
                JournalView journalView = new JournalView(controller.getJournalController());
                journalView.show();
            }
        });
        frame.getContentPane().add(btnShowJournal);
    }

    public void updateTotalBudgetLabel(double newBudget) {
        totalBudgetLabel.setText("Total Budget: $" + newBudget);
    }

    public void show() {
        // Make the dashboard view visible
        frame.setVisible(true);
    }
}
