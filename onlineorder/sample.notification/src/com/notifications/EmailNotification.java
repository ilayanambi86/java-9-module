package com.notifications;

public class EmailNotification implements Notification{
    @Override
    public void sendNotificaion(String message, String email) {
        System.out.println(String.format("Sent email notification \"%s\" to %s",message, email));
    }
}
