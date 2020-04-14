package com.nchu.rebooks.repository;

import com.nchu.rebooks.model.User;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UsersRepository extends CrudRepository<User,Integer> {
    @Query("select * from users where name like :condition")
    Collection<User> findByName(@Param("condition") String name);

//    @Modifying
//    @Query("insert into users values (:id,:name,:nick_name,:pwd,:sex,:email,:tel1)")
//    boolean insertUser(@Param("id") String id,@Param("name") String name,
//                       @Param("nick_name") String nick_name,@Param("pwd") String pwd,
//                       @Param("sex") String sex,@Param("email") String email,@Param("tel1") String tel);
}
