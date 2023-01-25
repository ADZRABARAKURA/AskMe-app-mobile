package com.example.askme_app.Models;

public class User {
    private String login, email, password;
    private boolean is_author;

    public User() {}

    public User(String login, String email, String password, boolean is_author) {
        this.login = login;
        this.email = email;
        this.password = password;
        this.is_author = is_author;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getIsAuthor() {
        return is_author;
    }

    public void setIsAuthor(boolean is_author) {
        this.is_author = is_author;
    }
}
