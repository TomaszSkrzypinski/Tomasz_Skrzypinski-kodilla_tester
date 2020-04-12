package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager{



    public static Book createBook(String title, String author) { //jeśli metoda była niestatyczna nie potrafiłem jej wywoałać w klasie BookApplication;
        return new Book(title, author);
    }

    public static void main(String[] args) {

        List <Book> books = new ArrayList <>();
        Book book1 = BookManager.createBook("title1", "author1");
        Book book2 = BookManager.createBook("title2", "author2");
        Book book3 = BookManager.createBook("title3", "author3");
        books.add(book1);
        books.add(book2);
        books.add(book3);

        for (Book book : books)
            System.out.println(book);

    }


}

