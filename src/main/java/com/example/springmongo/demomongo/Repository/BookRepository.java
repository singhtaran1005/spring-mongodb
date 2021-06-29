package com.example.springmongo.demomongo.Repository;

import com.example.springmongo.demomongo.Models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
