package com.example.controllers;

import com.example.app.ChatApplication;
import com.example.colleague.ChatUser;
import com.example.colleague.User;
import com.example.mediator.ChatMediator;
import com.example.mediator.interfaces.IChatMediator;


public class ChatController {
    private final IChatMediator chat;
    private final User user1;
    private final User user2;
    private final User user3;
    private final ChatApplication app;

    public ChatController() {
        this.chat = new ChatMediator();

        this.user1 = new ChatUser(chat, "Nahuel");
        this.user2 = new ChatUser(chat, "Lucía");
        this.user3 = new ChatUser(chat, "Carlos");

        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        this.app = new ChatApplication(user1, user2, user3);
    }

    public void start() {
        app.start();
    }
}
