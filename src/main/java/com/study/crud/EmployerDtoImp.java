package com.study.crud;

import com.study.entity.Employer;
import com.study.storage.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import static com.study.utils.Utils.*;
import java.sql.Date;
import java.util.List;

public class EmployerDtoImp {

    HibernateUtil util = HibernateUtil.getInstance();

    public Employer addEmployee(Employer employee) {
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(employee);
            transaction.commit();
            return employee;
        }
    }

    public List<Employer> getAll() {
        try (Session session = util.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            Query<Employer> query = session.createNamedQuery("Employer_FindAll_Employer", Employer.class);
            List<Employer> resultLIst = query.list();
            transaction.commit();
            for (Employer emp: resultLIst) {
                System.out.println(emp);
            }
            return resultLIst;
        }
    }

    public List<Employer> getAllEmployes() {
        try (Session session = util.getSessionFactory().openSession()) {
            Query<Employer> query = session.createQuery("from Employer", Employer.class);
            return query.list();
            // or return session.createQuery("from Employer ", Employer.class).list();
        }
    }

    public void getEmpById(Long id) {
        try (Session session = util.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            Query<Employer> query =
                    session.createNamedQuery("Employer_FindById", Employer.class)
                            .setParameter("id", id);
            List<Employer> resultLIst = query.list();
            transaction.commit();
            System.out.println(resultLIst);
        }
    }

    public Employer getById(Long id) { // another case of find Employer by id
        try (Session session = util.getSessionFactory().openSession()) {
            return session.get(Employer.class, id);
        }
    }

    public boolean removeEmployer(Employer employer) {
        try (Session session = util.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.remove(employer);
            transaction.commit();
            return true;
        }
    }

    public void creatingEmployers(int count) {
        for (int i = 0; i < count; i++) {
            addEmployee(new Employer(getRandomName(),getRandomDepartment(), getRandomProject(),
                    new Date(System.currentTimeMillis())));
        }
    }


    public Employer updateEmployer(Long id) {
       try (Session session = util.getSessionFactory().openSession()) {
            Transaction tx1 = session.beginTransaction();
            Employer employer = session.get(Employer.class, id);
            employer.setName(getRandomName());
            employer.setDepartment(getRandomDepartment());
            employer.setProject(getRandomProject());
            session.merge(employer);
            tx1.commit();
            return employer;
        }
    }


    public Employer save(Employer employer) { // another case of save Employer by Object
        try (Session session = util.getSessionFactory().openSession()) {
            Transaction tx1 = session.beginTransaction();
            session.persist(employer);
            tx1.commit();
            return employer;
        }

    }
}
