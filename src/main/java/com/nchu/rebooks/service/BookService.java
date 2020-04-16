package com.nchu.rebooks.service;

import com.nchu.rebooks.model.Book;

import java.util.Collection;

public interface BookService {
    public Collection<Book> getAllBooks();
    public Collection<Book> findBooksByName(String name);
    public Book addBook(Book book);
    public void delBook(int id);
    public void updateBook(Book book);
}
