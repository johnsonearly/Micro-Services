package com.example.book.service.Controller;

import com.example.book.service.Entity.Book;
import com.example.book.service.Service.BookImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookImpl bookservice;
    @PostMapping
    public ResponseEntity<String> bookCreation(Book newBook){
        return bookservice.createBook(newBook);
    }
    @GetMapping("/getAll")
    public List<Book>getAllBooks()

    {
        return bookservice.getBooks();
    }



}
