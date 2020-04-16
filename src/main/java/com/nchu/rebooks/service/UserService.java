package com.nchu.rebooks.service;

import com.nchu.rebooks.model.User;

import java.util.Collection;

public interface UserService {
    public Collection<User> getAllUsers();

    public Collection<User> findUsersByName(String name);

    public User addUser(User user);

    public void delUser(int id);

    public void update(User user);

//    public boolean insertUser(User user);
}
