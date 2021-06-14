package com.github.huybg.service;

import com.github.huybg.entity.Student;
import com.github.huybg.repository.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDAO studentDAO;

    public List<Student> getListStudent() {
        return studentDAO.getAllStudent();
    }

    public boolean insertStudent(Student student) {
        if (student.getFullName() == null || student.getFullName().trim().equals("")) {
            return false;
        }
//        if (student.getBirthday() == null) {
//            return false;
//        }
        if (student.getHometown() == null) {
            return false;
        }
        if (student.getClassName() == null) {
            return false;
        }
        if (student.getGender() == null){
            return false;
        }
        return studentDAO.insertStudent(student);
    }
}
