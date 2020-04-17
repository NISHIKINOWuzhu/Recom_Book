package com.nchu.rebooks.service;

import com.nchu.rebooks.model.Course;

import java.util.Collection;

public interface CourseService {
    public Collection<Course> getAllCourse();
    public Collection<Course> findCourseByName(String name);
    public Course addCourse(Course course);
    public void deleteCourse(int id);
    public void updateCourse(Course course);
}
