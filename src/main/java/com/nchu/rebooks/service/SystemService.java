package com.nchu.rebooks.service;

import com.nchu.rebooks.model.User;

import java.util.Collection;

public interface SystemService {
    public Collection<User> getAllUsers();
    public Collection<User> findUsersByName(String name);
    public User addUser(User user);

//    public boolean insertUser(User user);
}
