package com.datamaking.spring.service;

import com.datamaking.spring.entity.Book;
import com.datamaking.spring.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    // Get/Select
    public List<Book> getBooks(Integer yop){
        /*List<Book> books = Arrays.asList(
                new Book(1, "2 States", "Description of 2 States", 2007,"Fiction"),
                new Book(2, "Harry Potter", "Description of Harry Potter", 2003,"Fiction"),
                new Book(3, "Thin Air", "Description of The Air", 2015,"NonFiction")
        );*/

        List<Book> books = new ArrayList<>();

        if (yop == null) {
            //bookRepository.findAll().forEach(book -> books.add(book));
            bookRepository.findAll().forEach(book -> {
                books.add(book);
            });
        } else {
            return bookRepository.findAllByYearOfPublication(yop);
        }

        return books;
    }

    public Book createBook(Book book){

        return bookRepository.save(book);
    }

    public Book getBookById(Integer bookId){
        Book book = bookRepository.findById(bookId).get();
        return book;
    }

    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    public String deleteBookById(Integer bookId) {
        bookRepository.deleteById(bookId);
        return "Deleted Successfully";
    }
}
