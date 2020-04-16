package com.nchu.rebooks.service;

import com.nchu.rebooks.model.User;
import com.nchu.rebooks.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UsersRepository userRepo;

    @Autowired
    public UserServiceImpl(UsersRepository userRepo) {
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

    @Override
    public void delUser(int id) {
        if (userRepo.existsById(id)){
            userRepo.deleteById(id);
        }
    }

    @Override
    public void update(User user) {
        if (userRepo.existsById(user.getId())){
            userRepo.updateUser(user.getName(),user.getPwd(),
                    user.getSex(),user.getEmail(),user.getTel(),user.getId());
        }
    }

//    @Override
//    public boolean insertUser(User user) {
//        return userRepo.insertUser(user.getId(),user.getName(),
//                user.getNick_name(),user.getPwd(),user.getSex(),user.getEmail(),user.getTel());
//    }
}
