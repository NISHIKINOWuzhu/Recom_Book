package com.nchu.rebooks.repository;

import com.nchu.rebooks.model.Major;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface MajorRepository extends CrudRepository<Major,Integer> {

    @Query("select * form major where name like :name")
    Collection<Major> findByName(@Param("name") String name);

    @Modifying
    @Query("update major set name=:name,info=:info where id=:id")
    boolean updateMajor(@Param("name") String name,
                        @Param("info") String info,
                        @Param("id") int id);
}
