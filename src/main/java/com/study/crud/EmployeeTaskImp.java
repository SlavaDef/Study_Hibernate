package com.study.crud;

import com.study.entity.EmployeeTask;
import com.study.entity.Employer;
import com.study.storage.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeTaskImp {

    HibernateUtil util = HibernateUtil.getInstance();

    public EmployeeTask addTask(EmployeeTask employeeTask) {
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(employeeTask);
            transaction.commit();
            return employeeTask;
        }
    }
}
