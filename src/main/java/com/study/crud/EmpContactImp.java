package com.study.crud;

import com.study.entity.EmpContacts;
import com.study.storage.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

import static com.study.utils.Utils.*;

public class EmpContactImp {

    HibernateUtil util = HibernateUtil.getInstance();

    public boolean addContact(EmpContacts contact) {
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
            addContact(new EmpContacts(getRandomPhones(),getRandomAddress(),
                    getRandomEmails()));
            System.out.println("Ok");
        }
    }

    public List<EmpContacts> getAllContacts() {
        try (Session session = util.getSessionFactory().openSession()) {
            return session.createQuery("from EmpContacts", EmpContacts.class).list();
        }
    }

    public EmpContacts getById(Long id) { // another case of find Employer by id
        try (Session session = util.getSessionFactory().openSession()) {
            return session.get(EmpContacts.class, id);
        }
    }

    public void createRandomCont(){
        EmpContacts emp = new EmpContacts(getRandomPhones(),getRandomAddress(),getRandomEmails());
        addContact(emp);
    }
}
