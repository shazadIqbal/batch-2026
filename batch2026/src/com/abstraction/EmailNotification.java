package com.abstraction;

public class EmailNotification implements Notification,Connection{

    @Override
    public void send(String msg) {
        System.out.println("Sending email notification");
    }

    @Override
    public void connect(String apiKey) {

    }
}
