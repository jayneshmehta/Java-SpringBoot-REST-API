package com.springs.springs.services;

import java.util.List;

import com.springs.springs.entities.Course;

public interface CourseService {

	public List<Course> getCourses();
	
	public Course getCourse(int courseid);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourse(int Courseid);
}
