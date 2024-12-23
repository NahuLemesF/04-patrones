package com.example.mediator;

import com.example.colleague.User;
import com.example.mediator.interfaces.IChatMediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {
    private List<User> users;

    public ChatMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        users.stream()
                .filter(user -> !user.equals(sender))
                .forEach(user -> user.receive(message, sender.getName()));
    }

}
