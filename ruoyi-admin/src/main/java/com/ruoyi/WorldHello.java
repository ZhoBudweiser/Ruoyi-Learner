package com.ruoyi;

public class WorldHello implements HelloWorldInterface {
    private String message;

    @Override
    public String getMessage() {
        System.out.println("World message: "+message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
