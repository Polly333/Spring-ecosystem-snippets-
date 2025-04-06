package com.tight.coupling;

public class UserManager {
    //This forms the tight coupling
    private UserDatabase userDatabase = new UserDatabase();

    public String getUserInfo(){
        return userDatabase.getUserDetails();
    }
}
