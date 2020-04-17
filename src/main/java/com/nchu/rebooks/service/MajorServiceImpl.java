package com.nchu.rebooks.service;

import com.nchu.rebooks.model.Major;
import com.nchu.rebooks.repository.MajorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MajorServiceImpl implements MajorService {

    @Autowired
    MajorRepository majorRepo;

    @Override
    public Collection<Major> getAllMajors() {
        return (Collection<Major>) majorRepo.findAll();
    }

    @Override
    public Collection<Major> findMajorByName(String name) {
        return (Collection<Major>) majorRepo.findByName("%" + name + "%");
    }

    @Override
    public Major addMajor(Major major) {
        return majorRepo.save(major);
    }

    @Override
    public void deleteMajor(int id) {
        if (majorRepo.existsById(id)){
            majorRepo.deleteById(id);
        }
    }

    @Override
    public void updateMajor(Major major) {
        if (majorRepo.existsById(major.getId())){
            majorRepo.updateMajor(major.getName(),major.getInfo(),major.getId());
        }
    }
}
