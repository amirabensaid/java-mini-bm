package com.budgetmanagement.controllers;

import com.budgetmanagement.models.Journal;
import com.budgetmanagement.views.JournalView;

import java.util.List;

public class JournalController {
    private Journal model;
    private JournalView view;

    public JournalController(Journal model, JournalView view) {
        this.model = model;
        this.view = view;
    }

    public void addJournalEntry(String tag, String content) {
        model.addEntry(tag, content);
        view.updateJournalList(model.getEntriesAsString());
    }

    public List<Journal.JournalEntry> getJournalEntries() {
        return model.getEntries();
    }

    public void setJournalView(JournalView view) {
        this.view = view;
    }

    public Journal getJournalModel() {
        return model;
    }
}
