package com.abstraction;

public class PushNotification implements Notification{
    @Override
    public void send(String msg) {
        System.out.println("Sending ppush notification"+ msg);
    }
}
