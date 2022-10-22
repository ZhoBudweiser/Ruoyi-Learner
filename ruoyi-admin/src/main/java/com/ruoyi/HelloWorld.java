package com.ruoyi;

public class HelloWorld implements HelloWorldInterface {
    private String message;

    @Override
    public String getMessage() {
        System.out.println("message: "+message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
