package com.devLina.StudentMngSystem.service;

import com.devLina.StudentMngSystem.entity.Student;
import com.devLina.StudentMngSystem.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveSrtudent(Student student) {
        return studentRepository.save(student);
    }
}
