package com.devLina.quickstart.Controller;

import com.devLina.quickstart.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //handler method to handle list students and return mode and view

    @GetMapping("/students")
    public String listStudent(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students";

    }
}
