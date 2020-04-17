package com.nchu.rebooks.service;

import com.nchu.rebooks.model.Course;
import com.nchu.rebooks.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    CourseRepository courseRepo;

    @Override
    public Collection<Course> getAllCourse() {
        return (Collection<Course>) courseRepo.findAll();
    }

    @Override
    public Collection<Course> findCourseByName(String name) {
        return (Collection<Course>) courseRepo.findByName("%" + name + "%");
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public void deleteCourse(int id) {
        if (courseRepo.existsById(id)){
            courseRepo.deleteById(id);
        }
    }

    @Override
    public void updateCourse(Course course) {
        if (courseRepo.existsById(course.getId())){
            courseRepo.updateCourse(course.getName(),course.getInfo(),course.getId());
        }
    }
}
