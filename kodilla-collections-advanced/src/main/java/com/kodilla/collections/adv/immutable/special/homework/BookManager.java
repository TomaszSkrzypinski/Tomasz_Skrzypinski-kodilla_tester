package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager extends BookApplication {

    List <Book> books = new ArrayList <>();

    public List <Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book createBook(String title, String author) {
        if (books.size() == 0) {
            Book book = new Book(title, author);
            addBook(book);
            return book;
        } else
            for (int i = 0; i < books.size(); i++) {
                if (title.equals(books.get(i).getTitle()) && author.equals(books.get(i).getAuthor())) {
                    return books.get(i);}
                else{
                    Book book = new Book(title, author);
                    addBook(book);
                    return book;}
            }
        return null;
    }

    public void printBooksSize(){
        System.out.println(books.size());
    }
}

