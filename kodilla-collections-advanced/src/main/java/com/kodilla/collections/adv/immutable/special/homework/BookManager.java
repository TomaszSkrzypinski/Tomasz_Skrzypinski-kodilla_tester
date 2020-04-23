package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager extends BookApplication {

    List <Book> books = new ArrayList <>();

    public void addBook(Book book) {
        books.add(book);
        for (Book book1 : books)
            System.out.println(book1.getAuthor() + " " + book1.getTitle());
    }

    public Book createBook(String title, String author) {
        if (books.size() == 0) {
            addBook(new Book(title, author));
            return new Book(title, author);
        } else
            for (int i = 0; i < books.size(); i++) {
                if (title.equals(books.get(i).getTitle()) && author.equals(books.get(i).getAuthor())) {
                    return books.get(i);}
                addBook(new Book(title, author));
                return new Book(title, author);
            }
        return null;
    }
}

