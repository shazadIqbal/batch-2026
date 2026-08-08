package com.abstraction;

public class SmsNotification implements Notification{
    @Override
    public void send(String msg) {
        System.out.println("Sending sms notification "+msg);
    }
}
