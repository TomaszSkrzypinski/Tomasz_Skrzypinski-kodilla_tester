package com.kodilla.soap.ws;

import com.kodilla.courses.soap.GetBookRequest;
import com.kodilla.courses.soap.GetBookResponse;
import com.kodilla.soap.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BookEndpoint {
    private static final String NAMESPACE_URI = "http://kodilla.com/courses/soap";

    private BookRepository bookRepository;

    @Autowired
    public BookEndpoint(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookRequest")
    @ResponsePayload
    public GetBookResponse getCourse(@RequestPayload GetBookRequest request) {
        GetBookResponse response = new GetBookResponse();
        response.setBook(bookRepository.findBook(request.getSignature()));

        return response;
    }
}

