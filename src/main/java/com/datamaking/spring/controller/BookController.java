package com.datamaking.spring.controller;

import com.datamaking.spring.entity.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> getBooks(){
        List<Book> books = Arrays.asList(
                new Book(1, "2 States", "Description of 2 States", 2007,"Fiction"),
                new Book(2, "Harry Potter", "Description of Harry Potter", 2003,"Fiction"),
                new Book(3, "The Air", "Description of The Air", 2015,"NonFiction")
        );

        return books;
    }
}
