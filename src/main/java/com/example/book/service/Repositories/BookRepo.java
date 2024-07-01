package com.example.book.service.Repositories;

import com.example.book.service.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository< Book,Integer> {
    Book findByName(String name);
}
