package com.github.huybg.controller;

import com.github.huybg.service.StudentService;
import com.github.huybg.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("student", "command", new Student());
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public String addNewStudent(@ModelAttribute("abc") Student student, ModelMap modelMap) {
        modelMap.addAttribute("name", student.toString());
        return studentService.insertStudent(student) ? "success" : "error";
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public List<Student> getListStudent() {
        return studentService.getListStudent();
    }

}
