package com.example.colleague;

import com.example.mediator.interfaces.IChatMediator;

public class ChatUser extends User {
    public ChatUser(IChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(name + " envía: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message, String senderName) {
        System.out.println(name + " recibe de " + senderName + ": " + message);
    }
}
