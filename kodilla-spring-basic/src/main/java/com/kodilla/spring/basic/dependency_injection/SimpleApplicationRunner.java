package com.kodilla.spring.basic.dependency_injection;

public class SimpleApplicationRunner {

    public static void main(String[] args) {
        MessageService messageService = new EmailMessageService();
        SimpleApplication simpleApplication = new SimpleApplication(messageService);
        simpleApplication.processMessage("Test message", "receiver@mail.com");
    }
}
