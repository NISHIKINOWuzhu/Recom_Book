package com.nchu.rebooks.rest;

import com.nchu.rebooks.model.Book;
import com.nchu.rebooks.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1/books")
@CrossOrigin
public class BookRestController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "",method = RequestMethod.GET,produces = "application/json")
    public ResponseEntity<Collection<Book>> books(String name){
        Collection<Book> books;
        if (name == null){
            books = bookService.getAllBooks();
        } else {
            books = bookService.findBooksByName(name);
        }
        return new ResponseEntity<Collection<Book>>(books, HttpStatus.OK);
    }

    @RequestMapping(value = "",method = RequestMethod.POST,produces = "application/json")
    public ResponseEntity<Book> bookAdd(@RequestBody Book book){
        bookService.addBook(book);
        return new ResponseEntity<Book>(HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/del",method = RequestMethod.DELETE)
    public ResponseEntity<Collection<Book>> bookDel(@RequestParam("id") int id){
        bookService.delBook(id);
        return new ResponseEntity<Collection<Book>>(HttpStatus.OK);
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResponseEntity<Collection<Book>> bookEdit(@RequestBody Book book){
        bookService.updateBook(book);
        return new ResponseEntity<Collection<Book>>(HttpStatus.OK);
    }
}
