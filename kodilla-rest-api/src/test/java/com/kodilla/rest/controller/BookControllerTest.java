package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


class BookControllerTest {

    @Test
    public void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList <>();
        bookList.add(new BookDto("Title1", "Author1"));
        bookList.add(new BookDto("Title2", "Author2"));
        //when

        List<BookDto> result = bookController.getBooks();
        //then
        assertThat(bookList).hasSize(2);

    }

    @Test
    public void shouldAddBooks() {
        //given
        BookService bookService = new BookService();
        BookController bookController = new BookController(bookService);
        bookController.addBook(new BookDto("Title1", "Author1"));
        bookController.addBook(new BookDto("Title2", "Author2"));
        //when
        List<BookDto> result = bookService.getBooks();
        //then
        assertThat(result).hasSize(2);

    }
}