package com.budgetmanagement.views;

import com.budgetmanagement.controllers.ExpenseController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExpenseView {
    private ExpenseController controller;
    private JFrame frame;
    private JTextField categoryField;
    private JTextField amountField;

    public ExpenseView(ExpenseController controller) {
        this.controller = controller;
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Add Expense");
        frame.setBounds(100, 100, 300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(4, 1));

        JLabel lblCategory = new JLabel("Category:");
        frame.getContentPane().add(lblCategory);

        categoryField = new JTextField();
        frame.getContentPane().add(categoryField);
        categoryField.setColumns(10);

        JLabel lblAmount = new JLabel("Amount:");
        frame.getContentPane().add(lblAmount);

        amountField = new JTextField();
        frame.getContentPane().add(amountField);
        amountField.setColumns(10);

        JButton btnSave = new JButton("Save");
        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle the button click to save expense
                String category = categoryField.getText();
                double amount = Double.parseDouble(amountField.getText());

                // Update the expense controller with the data
                controller.setExpenseData(category, amount);
                controller.handleSaveButton();

                // Close the expense view
                frame.dispose();
            }
        });
        frame.getContentPane().add(btnSave);
    }

    public void show() {
        // Make the expense view visible
        frame.setVisible(true);
    }
}
