package com.nchu.rebooks.service;

import com.nchu.rebooks.model.School;

import java.util.Collection;

public interface SchoolService {
    public Collection<School> getAllSchools();
    public Collection<School> findSchoolByName(String name);
    public School addSchool(School school);
    public void delSchool(int id);
    public void updateSchool(School school);
}
