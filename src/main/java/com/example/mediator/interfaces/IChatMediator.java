package com.example.mediator.interfaces;

import com.example.colleague.User;

public interface IChatMediator {
    void sendMessage(String message, User sender);
    void addUser(User user);
}
