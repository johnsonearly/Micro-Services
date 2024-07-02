package com.example.book.service.Service;

import com.example.book.service.Entity.Book;
import com.example.book.service.Repositories.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookImpl {
    @Autowired
    private BookRepo repo;

    public ResponseEntity<String> createBook(Book newBook){
        Book currentBook = repo.findByName(newBook.getName());
        if(currentBook == null){
        repo.save(newBook);

        }
        else{
            return ResponseEntity.ok("Book already exists");
        }
        return ResponseEntity.ok("Book has been inserted successfully");

    }
    public List<Book> getBooks(){
        List<Book> listOfBooks = repo.findAll();

        return listOfBooks;
    }

}
