package com.nchu.rebooks.repository;

import com.nchu.rebooks.model.Course;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface CourseRepository extends CrudRepository<Course,Integer> {

    @Query("select * form course where name like :name")
    Collection<Course> findByName(@Param("name") String name);

    @Modifying
    @Query("update course set name=:name,info=:info where id=:id")
    boolean updateCourse(@Param("name") String name,
                         @Param("info") String info,
                         @Param("id") int id);
}
