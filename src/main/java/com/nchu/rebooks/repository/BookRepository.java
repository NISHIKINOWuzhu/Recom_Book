package com.nchu.rebooks.repository;

import com.nchu.rebooks.model.Book;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface BookRepository extends CrudRepository<Book,Integer> {
    @Query("select * from book where name like :condition")
    Collection<Book> findByName(@Param("condition") String name);

    @Modifying
    @Query("update book set name=:name, publish=:publish, isbn=:isbn, writer=:writer, " +
            "local_url=:url, price=:price, type=:type, upper=:upper, viewed=:viewed," +
            "cover=:cover, status=:status where id=:id")
    void updateBook(@Param("name") String name, @Param("publish") String publish,@Param("isbn") String isbn,
                    @Param("writer")String writer,@Param("url") String url,@Param("price") double price,
                    @Param("type") String type,@Param("upper") String upper,@Param("viewed") int viewed,
                    @Param("cover") String cover,@Param("status") int status,@Param("id") int id);
}
