package com.springboot.app.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service; 

import com.springboot.app.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {
	
	
	List <Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<Course>();
		list.add(new Course(145,"Java Course","This is Java Course"));
		list.add(new Course(4346,"Html Course","This is Html Course"));
		list.add(new Course(4869,"CSS Course","This is CSS Course"));
		list.add(new Course(455,"ajax Course","This is ajax Course"));
	}

	@Override
	public List<Course> getCourses() {
		
		return list;
	}

}
