package service;

import entity.Student;
import org.springframework.stereotype.Service;
import repository.StudentDAO;

import java.util.List;

@Service
public class StudentService {
    StudentDAO studentDAO = new StudentDAO();

    public List<Student> getListStudent() {
        return studentDAO.getAllStudent();
    }

    public boolean insertStudent(Student student) {
        List<Student> students = studentDAO.getAllStudent();
        students.sort((o1, o2) -> o1.getId() < o2.getId() ? 1 : -1);
        int id = students.get(0).getId() + 1;

        student.setId(id);
        if (student.getFullName() == null) {
            return false;
        }
        if (student.getBirthday() == null) {
            return false;
        }
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
