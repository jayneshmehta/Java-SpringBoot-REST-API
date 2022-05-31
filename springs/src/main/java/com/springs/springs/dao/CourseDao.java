package com.springs.springs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springs.springs.entities.Course;

public interface CourseDao extends JpaRepository<Course,Integer> {

}
