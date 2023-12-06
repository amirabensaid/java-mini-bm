package com.budgetmanagement.views;

import com.budgetmanagement.controllers.JournalController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JournalView {
    private JournalController controller;
    private JFrame frame;
    private JTextArea journalTextArea;

    public JournalView(JournalController controller) {
        this.controller = controller;
        initialize();
    }

    public JournalView() {
		// TODO Auto-generated constructor stub
	}

	private void initialize() {
        frame = new JFrame("Journal");
        frame.setBounds(100, 100, 300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        journalTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(journalTextArea);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        JButton btnAddEntry = new JButton("Add Entry");
        btnAddEntry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle the button click to add a journal entry
                // For example:
                // Create an instance of the JournalEntryView and show it
                JournalEntryView entryView = new JournalEntryView(controller);
                entryView.show();
            }
        });
        frame.getContentPane().add(btnAddEntry, BorderLayout.SOUTH);
    }

    public void updateJournalList(String entries) {
        // Update the journal text area with the entries
        journalTextArea.setText(entries);
    }

    public void show() {
        // Make the journal view visible
        frame.setVisible(true);
    }
}
