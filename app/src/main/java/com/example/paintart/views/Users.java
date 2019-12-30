package com.example.paintart.views;

public class Users {


    String UserName;
    String password;


    public Users(String userName, String password) {
        this.UserName = userName;
        this.password = password;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return password;
    }


    @Override
    public String toString() {
        return "Users{" +
                "UserName='" + UserName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
