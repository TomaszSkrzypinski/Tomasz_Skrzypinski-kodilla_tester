package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager extends BookApplication{

    public Book createBook(String title, String author) {
        //Nie mam pomysłu jak się zabrać za porównanie tworzonego obiektu.
        return new Book(title, author);
    }

    public static void main(String[] args) {

        BookManager bookManager = new BookManager();

        List <Book> books = new ArrayList <>();
        Book book1 = bookManager.createBook("title1", "author1");
        Book book2 = bookManager.createBook("title2", "author2");
        Book book3 = bookManager.createBook("title3", "author3");
        books.add(book1); //Jak zrobić, żeby przypisać do kolekcji obiekt "book1" bezpośrednio z klasy BookApplication?
        books.add(book2);
        books.add(book3);

        for (Book book : books)
            System.out.println(book);

    }
}

