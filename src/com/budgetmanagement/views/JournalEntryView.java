package com.budgetmanagement.views;

import com.budgetmanagement.controllers.JournalController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JournalEntryView {
    private JournalController controller;
    private JFrame frame;
    private JTextField tagsField;
    private JTextArea textArea;

    public JournalEntryView(JournalController controller) {
        this.controller = controller;
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Add Journal Entry");
        frame.setBounds(100, 100, 300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(2, 2));

        JLabel lblTags = new JLabel("Tags:");
        inputPanel.add(lblTags);

        tagsField = new JTextField();
        inputPanel.add(tagsField);

        JLabel lblText = new JLabel("Text:");
        inputPanel.add(lblText);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        inputPanel.add(scrollPane);

        frame.getContentPane().add(inputPanel, BorderLayout.CENTER);

        JButton btnSave = new JButton("Save");
        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle the button click to save the journal entry
                String tags = tagsField.getText();
                String text = textArea.getText();
                
                // Pass the data to the controller for processing
                controller.addJournalEntry(tags, text);

                // Close the entry view
                frame.dispose();
            }
        });
        frame.getContentPane().add(btnSave, BorderLayout.SOUTH);
    }

    public void show() {
        // Make the entry view visible
        frame.setVisible(true);
    }
}
