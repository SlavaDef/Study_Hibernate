package com.study.dto;

import com.study.entity.Employer;
import com.study.storage.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class EmployerDtoImp {

    HibernateUtil util = HibernateUtil.getInstance();

    public void addEmployee(Employer employee ) {
        try (Session session = util.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();

        }
    }

    public List<Employer> getAll(){
        try(Session session = util.getSessionFactory().openSession() ) {
            Transaction transaction = session.beginTransaction();

            Query<Employer> query = session.createNamedQuery("Employer_FindAll_Employer", Employer.class);
            List<Employer> resultLIst = query.list();
            transaction.commit();
            System.out.println(resultLIst);
            return resultLIst;
        }
    }

    public List<Employer> getAllEmployes() {
        try (Session session = util.getSessionFactory().openSession() ) {
            Query<Employer> query = session.createQuery("from Employer", Employer.class);
            return query.list();
        }
    }

    public void getEmpById(long id){
        try( Session session = util.getSessionFactory().openSession();){
            Transaction transaction = session.beginTransaction();

            Query<Employer> query =
                    session.createNamedQuery("Employer_FindById", Employer.class)
                            .setParameter("id",id);
            List<Employer> resultLIst = query.list();
            transaction.commit();
            System.out.println(resultLIst);
        }
    }
}
