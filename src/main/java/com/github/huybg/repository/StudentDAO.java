package com.github.huybg.repository;

import com.github.huybg.entity.Student;
import com.github.huybg.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAO {

    public List<Student> getAllStudent() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Student").list();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insertStudent(Student student) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return false;
    }
}
