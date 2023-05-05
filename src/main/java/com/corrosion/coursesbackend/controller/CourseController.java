package com.corrosion.coursesbackend.controller;

import com.corrosion.coursesbackend.model.Course;
import com.corrosion.coursesbackend.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/cursos")
@CrossOrigin(origins = "http://localhost:4200")
public class CourseController {

    @Autowired
    CourseService courseService;

    //solicitudes get
    @GetMapping("/cursos/todos-los-cursos")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/cursos/{nameCourse}")
    public Course getACourse(@PathVariable String nameCourse){
        return courseService.getACourse(nameCourse);
    }

    @GetMapping("/cursos/duracion?{durationCouse}")
    public List<Course> getCoursesBYDuration(@PathVariable Integer durationCourse){
        return courseService.getCoursesByDuration(durationCourse);
    }

    @GetMapping("/cursos/categorias/{categoryCourse}")
    public List<Course> getCoursesByCategory(@PathVariable String categoryCourse){
        return courseService.getCoursesByCategory(categoryCourse);
    }

    //solicitudes post

    @PostMapping("/cursos/agregar-curso")
    public void PostACourse(@RequestBody Course course){
        courseService.postACourse(course);
    }


}
