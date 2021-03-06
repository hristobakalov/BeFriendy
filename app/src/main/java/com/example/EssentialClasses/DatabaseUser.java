package com.example.EssentialClasses;

import java.util.Map;

/**
 * Created by k0r on 09-Nov-16.
 */

public class DatabaseUser {

    private String userName;
    private String email;
    private String password;
    private String userId;
    private int tokenId;
    private Map<String, String> userGames; //first string = game id, second string = player 2 id

    public DatabaseUser(){
        //empty default constructor for Firebase;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTokenId() {
        return tokenId;
    }

    public void setTokenId(int tokenId) {
        this.tokenId = tokenId;
    }

    public Map<String, String> getUserGames() {
        return userGames;
    }

    public void setUserGames(Map<String, String> userGames) {
        this.userGames = userGames;
    }
}
