package com.corrosion.coursesbackend.repository;

import com.corrosion.coursesbackend.model.Course;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

    public Course findByNameCourse(String courseName);

    @Transactional

    public void deleteByNameCourse(String courseName);

    public List<Course> findByTeacherCourse(String courseTeacher);

    public List<Course> findByHoursCourse(Integer courseDuration);

    public List<Course> findByCategoryCourse(String courseCategory);
}