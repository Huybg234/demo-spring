package controller;

import entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import service.StudentService;

import java.util.List;

@Controller
@RequestMapping({"/"})
public class StudentController {

    private StudentService studentService;

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("Student", "command", new Student());
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public String addNewStudent(@ModelAttribute("abc") Student student, ModelMap modelMap) {
        modelMap.addAllAttributes("name", student.toString());
       return studentService.insertStudent(student) ? "Success" : "Error";
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public List<Student> getListStudent() {
        return studentService.getListStudent();
    }
}
