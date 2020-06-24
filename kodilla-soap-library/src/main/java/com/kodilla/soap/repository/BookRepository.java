package com.kodilla.soap.repository;

import com.kodilla.courses.soap.Book;
import com.kodilla.courses.soap.Genre;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class BookRepository {
    private static final Map<String, Book> books = new HashMap<>();

    @PostConstruct
    public void initData() {
        Book book = new Book();
        book.setAuthor("Author");
        book.setTitle("Title");
        book.setGenre(Genre.SCI_FI);
        book.setRelease(2002);
        book.setSignature("abcd");

        books.put(book.getSignature(), book);

        Book book2 = new Book();
        book2.setAuthor("Author2");
        book2.setTitle("Title2");
        book2.setGenre(Genre.CRIME);
        book2.setRelease(2012);
        book2.setSignature("bcde");

        books.put(book2.getSignature(), book2);

        Book book3 = new Book();
        book3.setAuthor("Author3");
        book3.setTitle("Title3");
        book3.setGenre(Genre.FANTASY);
        book3.setRelease(2014);
        book3.setSignature("cdef");

        books.put(book3.getSignature(), book3);

        Book book4 = new Book();
        book4.setAuthor("Author4");
        book4.setTitle("Title4");
        book4.setGenre(Genre.TECH);
        book4.setRelease(2004);
        book4.setSignature("defg");

        books.put(book4.getSignature(), book4);
    }

    public Book findBook(String signature) {
        Assert.notNull(signature, "You have to specify the book's signature");
        return books.get(signature);
    }
}