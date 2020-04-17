package com.nchu.rebooks.service;

import com.nchu.rebooks.model.Major;

import java.util.Collection;

public interface MajorService {
    public Collection<Major> getAllMajors();
    public Collection<Major> findMajorByName(String name);
    public Major addMajor(Major major);
    public void deleteMajor(int id);
    public void updateMajor(Major major);
}
