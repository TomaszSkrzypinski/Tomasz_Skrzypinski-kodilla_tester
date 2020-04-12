package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = BookManager.createBook("title1", "author1");
        Book book2 = BookManager.createBook("title2", "author2");
        Book book3 = BookManager.createBook("title3", "author3");

        System.out.println(book1 == book2);
        System.out.println(book3 == book2);
    }
}
