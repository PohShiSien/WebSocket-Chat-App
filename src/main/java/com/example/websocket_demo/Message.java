package com.example.websocket_demo;

public class Message {
    private String user;
    private String message;

    // Default constructor: required in spring boot, needed when spring creates objects automatically to auto-create an object from JSON or WebSocket message
    public Message(){}

    // Parameterized constructor makes it easy to create a Message object manually in code to quickly create an object with values
    public Message(String user, String message) {
        this.user = user;
        this.message = message;
    }

    public String getUser() { return user; }
    public String getMessage() { return message; }
}
