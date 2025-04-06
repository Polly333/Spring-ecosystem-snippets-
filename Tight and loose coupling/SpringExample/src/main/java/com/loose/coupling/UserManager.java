package com.loose.coupling;

public class UserManager {
    private UserDataProvider userDataProvider;

    //loose coupling achieved through UserDataProvider Interface
    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo(){
        return userDataProvider.getUserDetails();
    }
}
