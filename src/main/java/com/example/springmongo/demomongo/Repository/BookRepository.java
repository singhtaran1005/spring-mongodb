package com.example.springmongo.demomongo.Repository;

import com.example.springmongo.demomongo.Models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, Integer> {


    public List<Book> findByAuthorName(String name);
}
