package com.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.entities.Course;
import com.springboot.app.service.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private  CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "welcome home";
		
	}
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
	}
	
	

}
