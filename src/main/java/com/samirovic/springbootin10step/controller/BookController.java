package com.samirovic.springbootin10step.controller;

import com.samirovic.springbootin10step.entity.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {
    private static Logger LOG = LoggerFactory.getLogger(BookController.class);

    @GetMapping("/books")
    public List<Book> getAllBooks(){

        return Arrays.asList(new Book(1l, "Spring 5.0", "12 euro"));
    }
}
