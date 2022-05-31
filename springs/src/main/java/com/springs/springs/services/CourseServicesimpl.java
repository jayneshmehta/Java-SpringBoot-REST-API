package com.springs.springs.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springs.springs.dao.CourseDao;
import com.springs.springs.entities.Course;

@Service
public class CourseServicesimpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
//	List<Course> list;
	
	public CourseServicesimpl() {
//		list = new ArrayList<>();
//		list.add(new Course(145,"java Core","Course contain basic's of java"));
//		list.add(new Course(2020,"SpringBoot","Course contain basic's of Spring Boot"));

	}
	@Override
	public List<Course> getCourses(){
		return courseDao.findAll();
	}
	@Override
	public Course getCourse(int courseid) {
//	   Course c = null;
//	   for(Course course : list) {
//		   if(course.getId()== courseid) {
//			  c = course; 
//		   break;
//		   }
//	   }
	   return courseDao.getOne(courseid);
	}
	
	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course) {
//		   list.forEach(e ->{
//			   if(e.getId() == course.getId()) {
//				   e.setTitle(course.getTitle());
//				   e.setDescription(course.getDescription());
//			   }
//		   });
		courseDao.save(course);
		return course;
	}
	@Override
	public void deleteCourse(int Courseid) {
//		list = this.list.stream().filter(e -> e.getId()!= Courseid).collect(Collectors.toList());
	Course entity = courseDao.getOne(Courseid);
	courseDao.delete(entity);
	}
}
