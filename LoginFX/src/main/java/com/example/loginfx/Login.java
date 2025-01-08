package com.example.loginfx;

public class Login {
    public static boolean verifyUserLogin(String username, String password) {
        boolean credentialsVerified = false;

        username = username.trim().toLowerCase(); //sanitise username to lowercase removing spaces
        if (DataStorage.usernamesAndPasswords.containsKey(username) && DataStorage.usernamesAndPasswords.get(username).equals(password)) { //if username exists and password matches value in hashmap
            System.out.println("Welcome back " + username);
            credentialsVerified = true;
        }
        return credentialsVerified;
    }
}
