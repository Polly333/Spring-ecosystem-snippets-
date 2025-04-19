package com.udemy.FirstSpring;

public class HelloResponse {

    private String message;


    public HelloResponse(String s) {
        this.message = s;
    }

    public String getMessage() {
        //getter
        return message;
    }

    //public void setMessage(String s) {
        //setter can omit , as Jackson library uses the getter
        //this.message=s;
    //}
}
