package com.nchu.rebooks.service;

import com.nchu.rebooks.model.Book;
import com.nchu.rebooks.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepo;

    @Autowired
    public BookServiceImpl(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public Collection<Book> getAllBooks() {
        return (Collection<Book>) bookRepo.findAll();
    }

    @Override
    public Collection<Book> findBooksByName(String name) {
        return (Collection<Book>) bookRepo.findByName("%" + name + "%");
    }

    @Override
    public Book addBook(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public void delBook(int id) {
        if (bookRepo.existsById(id)) {
            bookRepo.deleteById(id);
        }
    }

    @Override
    public void updateBook(Book book) {
        if (bookRepo.existsById(book.getId())) {
            bookRepo.updateBook(book.getName(), book.getPublish(), book.getIsbn(), book.getWriter(),
                    book.getLocal_url(), book.getPrice(), book.getType(), book.getUpper(), book.getViewed(),
                    book.getCover(), book.getStatus(), book.getId());
        }
    }
}
