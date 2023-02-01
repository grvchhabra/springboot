package com.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> getAllCourses() {
		return Arrays.asList(
				new Course(1, "Java Fundamentals", "Gaurav"),
				new Course(2, "Google Cloud Fundamentals", "Gaurav"),
				new Course(3, "Google Cloud Architect", "Gaurav")
				);
	}
}
