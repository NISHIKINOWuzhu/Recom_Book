package com.nchu.rebooks.rest;

import com.nchu.rebooks.model.User;
import com.nchu.rebooks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1/users")
public class UserRestController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "",method = RequestMethod.GET,produces = "application/json")
    public ResponseEntity<Collection<User>> users(String name){
        Collection<User> users;
        if (name == null){
            users = userService.getAllUsers();
        } else {
            users = userService.findUsersByName(name);
        }
        return new ResponseEntity<Collection<User>>(users, HttpStatus.OK);
    }

    @RequestMapping(value = "",method = RequestMethod.POST,produces = "application/json")
    public ResponseEntity<User> usersAdd(@RequestBody User user){
        userService.addUser(user);
//        systemService.insertUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE,produces = "application/json")
    public ResponseEntity<User> delUser(@RequestParam int id){
        userService.delUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT,produces = "application/json")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        userService.update(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
