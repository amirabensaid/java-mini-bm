package com.budgetmanagement.models;

public class User {
    private String username;
    private String password;

    public User() {
        // Default constructor
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean authenticate(String enteredPassword) {
        // Add logic to check credentials (e.g., check against a database)
        // For simplicity, comparing entered password with the stored password
        return enteredPassword.equals(password);
    }

	public boolean checkCredentials() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
