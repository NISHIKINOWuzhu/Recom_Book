package com.nchu.rebooks.repository;

import com.nchu.rebooks.model.Book;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface BookRepository extends CrudRepository<Book,Integer> {
    @Query("select * from book where name like :condition")
    Collection<Book> findByName(@Param("condition") String name);
}
