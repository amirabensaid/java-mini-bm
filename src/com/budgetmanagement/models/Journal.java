package com.budgetmanagement.models;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<JournalEntry> entries;

    public Journal() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String tag, String content) {
        JournalEntry entry = new JournalEntry(tag, content);
        entries.add(entry);
    }

    public List<JournalEntry> getEntries() {
        return entries;
    }

    public String getEntriesAsString() {
        StringBuilder result = new StringBuilder();
        for (JournalEntry entry : entries) {
            result.append(entry.getTag()).append(": ").append(entry.getContent()).append("\n");
        }
        return result.toString();
    }

    public static class JournalEntry {
        private String tag;
        private String content;

        public JournalEntry(String tag, String content) {
            this.tag = tag;
            this.content = content;
        }

        public String getTag() {
            return tag;
        }

        public String getContent() {
            return content;
        }
    }
}
