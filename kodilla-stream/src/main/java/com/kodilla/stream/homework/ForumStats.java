package com.kodilla.stream.homework;

import com.kodilla.stream.UserRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgUp40 =  UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge()>= 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n->n)
                .average()
                .getAsDouble();

        double avgUnder40 =  UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge()< 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n->n)
                .average()
                .getAsDouble();

        System.out.println("Average numbers of posts users 40 and up: " + avgUp40);
        System.out.println("Average numbers of posts users under 40: " + avgUnder40);

    }
}
