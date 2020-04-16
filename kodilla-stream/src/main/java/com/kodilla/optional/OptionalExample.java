package com.kodilla.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User ("user1", 30, 100, "Test");

        Optional<User> optionalUser = Optional.ofNullable(user);

        optionalUser.ifPresent(u -> System.out.println(u.getUsername()));

        User user2 = null;

        Optional<User> optionalUser2 = Optional.ofNullable(user2);

        int username2 =
                optionalUser2.orElse(new User("", 12, 0,"")).getAge();

        System.out.println(username2);
    }
}
