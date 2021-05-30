package com.datamaking.spring.controller;

import com.datamaking.spring.entity.Book;
import com.datamaking.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> getBooks(){

        return bookService.getBooks();
    }

    @RequestMapping(value = "/books", method = RequestMethod.POST)
    public Book creatBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

    @RequestMapping(value = "books/{id}", method = RequestMethod.GET)
    public Book getBookById(@PathVariable("id") Integer bookId){
        Book book = bookService.getBookById(bookId);
        return book;
    }

    @RequestMapping(value = "books", method = RequestMethod.PUT)
    public Book updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }
}
