package com.devLina.StudentMngSystem.service;



import com.devLina.StudentMngSystem.entity.Student;

import java.util.List;

public interface StudentService {
List<Student> getAllStudents();
Student saveSrtudent(Student student);
}
