package com.study;

import com.study.crud.EmpContactImp;
import com.study.crud.EmployeeTaskImp;
import com.study.crud.EmployerDtoImp;
import com.study.entity.EmpContacts;
import com.study.entity.Employer;

import java.util.List;

import static com.study.utils.Utils.*;


public class App {
    public static void main(String[] args) {
       // Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
        EmployerDtoImp dtoImp = new EmployerDtoImp();
        EmpContactImp cont = new EmpContactImp();
        EmployeeTaskImp taskImp = new EmployeeTaskImp();

        dtoImp.creatingEmployers(9);
        cont.creatingContacts(9);


       // System.out.println(dtoImp.getAllEmployes());
       // dtoImp.getAll();
        EmpContacts contacts = new EmpContacts();
        contacts.setMobPhone(getRandomPhones());
        contacts.setEmpAddress(getRandomAddress());
        contacts.setEmpEmail(getRandomEmails());

        Employer employer = dtoImp.getById(5L);
        employer.setContacts(List.of(contacts));
        dtoImp.updateEmployer(employer.getId());
        System.out.println(dtoImp.getById(5L));

      /*  EmployeeTask task1 = new EmployeeTask();
        task1.setDescription("Make money");
        taskImp.addTask(task1);
        EmployeeTask task2 = new EmployeeTask();
        task1.setDescription("Copi Doc");
        taskImp.addTask(task2);

        Employer Bob = dtoImp.getById(2L);
        Bob.getTasks().add(task1);
        Bob.getTasks().add(task2);
        dtoImp.updateEmployer(2L);

        System.out.println(dtoImp.getById(2L)); */


    }
}