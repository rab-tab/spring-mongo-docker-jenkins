package com.springmongodbdocker.controller;


import com.springmongodbdocker.dao.BookRepository;
import com.springmongodbdocker.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @PostMapping
    public Book save(@RequestBody Book book) {
        return bookRepository.save(book);

    }

    @GetMapping
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }
}
