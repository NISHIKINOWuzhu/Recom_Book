package com.nchu.rebooks.service;

import com.nchu.rebooks.model.School;
import com.nchu.rebooks.repository.BookRepository;
import com.nchu.rebooks.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.Collection;

@Service
public class SchoolServiceImpl implements SchoolService{

    @Autowired
    SchoolRepository schRepo;

    @Override
    public Collection<School> getAllSchools() {
        return (Collection<School>) schRepo.findAll();
    }

    @Override
    public Collection<School> findSchoolByName(String name) {
        return (Collection<School>) schRepo.findByName("%" + name + "%");
    }

    @Override
    public School addSchool(School school) {
        return schRepo.save(school);
    }

    @Override
    public void delSchool(int id) {
        if (schRepo.existsById(id)){
            schRepo.deleteById(id);
        }
    }

    @Override
    public void updateSchool(School school) {
        if (schRepo.existsById(school.getId())){
            schRepo.updateSchool(school.getName(),school.getAddress(),
                    school.getTel(),school.getInfo(),school.getId());
        }
    }
}
