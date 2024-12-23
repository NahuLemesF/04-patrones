package com.example.app;

import com.example.colleague.User;

import java.util.Scanner;

public class ChatApplication {
    private final User user1;
    private final User user2;
    private final User user3;

    public ChatApplication(com.example.colleague.User user1, User user2, User user3) {
        this.user1 = user1;
        this.user2 = user2;
        this.user3 = user3;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        promptUserMessage(user1, scanner);

        promptUserMessage(user2, scanner);

        promptUserMessage(user3, scanner);

        scanner.close();
    }

    private void promptUserMessage(User user, Scanner scanner) {
        System.out.println(user.getName() + ", escribe tu mensaje:");
        String message = scanner.nextLine();
        user.send(message);
    }
}
