package com.tipu.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tipu.main.model.Course;

@Repository
public interface CourseRepository extends JpaRepository <Course, Integer>{
	

}
