package com.example.colleague;


import com.example.mediator.interfaces.IChatMediator;

public abstract class User {
    protected IChatMediator mediator;
    protected String name;

    public User(IChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void send(String message);
    public abstract void receive(String message, String senderName);
}
