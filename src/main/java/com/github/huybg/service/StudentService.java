package com.github.huybg.service;

import com.github.huybg.entity.Student;
import com.github.huybg.repository.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDAO studentDAO;

    public List<Student> getListStudent() {
        return studentDAO.getAllStudent();
    }

    public boolean insertStudent(Student student) {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        String birthday = formatDate.format(student.getBirthday());
        try {
            student.setBirthday(formatDate.parse(birthday));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (student.getFullName() == null || student.getFullName().trim().equals("")) {
            return false;
        }
        if (student.getBirthday() == null || student.getBirthday().toString().trim().equals("")) {
            return false;
        }
        if (student.getHometown() == null || student.getHometown().trim().equals("")) {
            return false;
        }
        if (student.getClassName() == null || student.getClassName().trim().equals("")) {
            return false;
        }
        if (student.getGender() == null || student.getGender().trim().equals("")){
            return false;
        }
        return studentDAO.insertStudent(student);
    }
}
