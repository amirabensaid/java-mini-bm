package com.budgetmanagement.models;

public class JournalEntry {
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
