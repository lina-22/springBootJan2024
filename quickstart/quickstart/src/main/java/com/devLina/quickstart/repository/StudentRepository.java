package com.devLina.quickstart.repository;

import com.devLina.quickstart.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
}
