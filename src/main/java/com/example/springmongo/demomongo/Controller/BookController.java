package com.example.springmongo.demomongo.Controller;

import com.example.springmongo.demomongo.Models.Book;
import com.example.springmongo.demomongo.Repository.BookRepository;
import com.example.springmongo.demomongo.Request.CreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {


    @Autowired
    BookRepository bookRepository;


    @GetMapping("/getBooks")
    public List<Book> getBook() {
        return bookRepository.findAll();
    }

    //pojo
    @PostMapping("/insertBook")
    public void insertBook(@RequestBody CreateRequest request) {
        Book book = new Book(request.getName(), request.getAuthorName(), request.getCost());
        bookRepository.save(book);
    }


//    @GetMapping("/getBookByAuthor")
//    public List<Book> getBookByAuthorName(@RequestParam(value = "name") String name) {
//        return bookRepository.findByAuthorName(name);
//    }

    @GetMapping("/getBookByAuthor/{name}")
    public List<Book> getBookByAuthorName(@PathVariable(value = "name") String name) {
        return bookRepository.findByAuthorName(name);
    }
}
