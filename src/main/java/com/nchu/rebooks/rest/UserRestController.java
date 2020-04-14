package com.nchu.rebooks.rest;

import com.nchu.rebooks.model.User;
import com.nchu.rebooks.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1/users")
public class UserRestController {

    @Autowired
    SystemService systemService;

    @RequestMapping(value = "",method = RequestMethod.GET,produces = "application/json")
    public ResponseEntity<Collection<User>> users(String name){
        Collection<User> users;
        if (name == null){
            users = systemService.getAllUsers();
        } else {
            users = systemService.findUsersByName(name);
        }
        return new ResponseEntity<Collection<User>>(users, HttpStatus.OK);
    }

    @RequestMapping(value = "",method = RequestMethod.POST,produces = "application/json")
    public ResponseEntity<User> usersAdd(@RequestBody User user){
        systemService.addUser(user);
//        systemService.insertUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
