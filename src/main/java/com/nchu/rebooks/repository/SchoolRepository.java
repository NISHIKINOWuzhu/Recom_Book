package com.nchu.rebooks.repository;

import com.nchu.rebooks.model.School;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface SchoolRepository extends CrudRepository<School,Integer> {
    @Query("select * form school where name like :condition")
    Collection<School> findByName(@Param("condition") String name);

    @Modifying
    @Query("update school set name=:name, address=:address,tel=:tel,info=:info where id=:id")
    boolean updateSchool(@Param("name") String name,@Param("address") String address,
                         @Param("tel") String tel,@Param("info") String info,
                         @Param("id") int id);
}
