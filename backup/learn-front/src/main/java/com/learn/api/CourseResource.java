package com.learn.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.learn.model.Course;
import com.learn.service.CoursesHardcodedService;

@RestController
public class CourseResource {
  @Autowired
  private CoursesHardcodedService courseManagementService;
  @GetMapping("/instructors/{username}/courses")
  public List<Course> getAllCourses(@PathVariable String username) {
    return courseManagementService.findAll();
  }
}