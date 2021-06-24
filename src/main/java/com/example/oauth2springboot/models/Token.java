package com.example.oauth2springboot.models;

public class Token {
    String access_token;
    String username;

    public Token() {
    }

    public Token(String access_token, String username) {
        this.access_token = access_token;
        this.username = username;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
