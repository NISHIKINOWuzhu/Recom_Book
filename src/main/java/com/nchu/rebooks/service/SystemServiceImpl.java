package com.nchu.rebooks.service;

import com.nchu.rebooks.model.User;
import com.nchu.rebooks.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SystemServiceImpl implements SystemService {

    @Autowired
    UsersRepository userRepo;

    @Autowired
    public SystemServiceImpl(UsersRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public Collection<User> getAllUsers() {
        return (Collection<User>) userRepo.findAll();
    }

    @Override
    public Collection<User> findUsersByName(String name) {
        return (Collection<User>) userRepo.findByName("%" + name + "%");
    }

    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }

//    @Override
//    public boolean insertUser(User user) {
//        return userRepo.insertUser(user.getId(),user.getName(),
//                user.getNick_name(),user.getPwd(),user.getSex(),user.getEmail(),user.getTel());
//    }
}
