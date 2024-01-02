package com.devLina.StudentMngSystem.repository;


import com.devLina.StudentMngSystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
}
