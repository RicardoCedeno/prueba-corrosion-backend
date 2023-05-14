package com.corrosion.coursesbackend.service;

import com.corrosion.coursesbackend.model.Course;
import com.corrosion.coursesbackend.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public Course getACourse(String courseName){
        return courseRepository.findByNameCourse(courseName);
    }

    public List<Course> getCoursesByTeacher(String teacher){
        return courseRepository.findByTeacherCourse(teacher);
    }

    public List<Course> getCoursesByDuration(Integer duration){
        return courseRepository.findByHoursCourse(duration);
    }

    public List<Course> getCoursesByCategory(String category){
        return courseRepository.findByCategoryCourse(category);
    }

    //solicitudes post

    public void postACourse(Course course){
        courseRepository.save(course);
    }

    //solicitud delete

    public void deleteACourse(Integer idCourse){
        courseRepository.deleteById(idCourse);
    }

    public void deleteACourseByName(String courseName){
        courseRepository.deleteByNameCourse(courseName);
    }

    public void putCourse(Course newCourse){

        Course oldCourse=courseRepository.findById(newCourse.getIdCourse()).orElse(null);

        oldCourse.setNameCourse(newCourse.getNameCourse());
        oldCourse.setTeacherCourse(newCourse.getTeacherCourse());
        oldCourse.setCategoryCourse(newCourse.getCategoryCourse());
        oldCourse.setContentCourse(newCourse.getContentCourse());
        oldCourse.setImageCourse(newCourse.getImageCourse());
        oldCourse.setHoursCourse(newCourse.getHoursCourse());

        courseRepository.save(oldCourse);
    }
}