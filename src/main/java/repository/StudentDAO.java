package repository;

import entity.Student;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import util.HibernateUtil;

import java.util.List;

@Repository
public class StudentDAO {
    Logger logger = Logger.getLogger(StudentDAO.class);

    public List<Student> getAllStudent() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Student ").list();
        } catch (HibernateException e) {
            logger.error(e);
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
            logger.error(e);
        }
        return false;
    }
}
