package com.study.crud;

import com.study.entity.Employer;
import com.study.entity.EmployerContacts;
import com.study.storage.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.sql.Date;
import java.util.List;

import static com.study.utils.Utils.*;

public class EmpContactImp {

    HibernateUtil util = HibernateUtil.getInstance();

    public boolean addContact(EmployerContacts contact) {
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(contact);
            transaction.commit();
            return true;
            } catch (Exception exception) {
            return false;
        }
        }


    public void creatingContacts(int count) {
        for (int i = 0; i < count; i++) {
            addContact(new EmployerContacts(getRandomPhones(),getRandomAddress(),
                    getRandomEmails()));
            System.out.println("Ok");
        }
    }

    public List<EmployerContacts> getAllContacts() {
        try (Session session = util.getSessionFactory().openSession()) {
            return session.createQuery("from EmployerContacts ", EmployerContacts.class).list();
        }
    }

    public EmployerContacts getById(Long id) { // another case of find Employer by id
        try (Session session = util.getSessionFactory().openSession()) {
            return session.get(EmployerContacts.class, id);
        }
    }
}
