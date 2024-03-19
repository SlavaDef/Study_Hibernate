package com.study;

import com.study.crud.EmpContactImp;
import com.study.crud.EmployerDtoImp;
import com.study.entity.Employer;
import com.study.entity.EmployerContacts;

import java.sql.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static com.study.utils.Utils.*;
import static com.study.utils.Utils.getRandomEmails;


public class App {
    public static void main(String[] args) {

        EmployerDtoImp dtoImp = new EmployerDtoImp();
        EmpContactImp cont = new EmpContactImp();

      //  dtoImp.creatingEmployers(9);
      //  cont.creatingContacts(9);

      /*  Employer employer = new Employer(getRandomName(),getRandomDepartment(), getRandomProject(),
                new Date(System.currentTimeMillis()));
        employer.setContacts(List.of(new EmployerContacts(getRandomPhones(),getRandomAddress(),
                getRandomEmails()),new EmployerContacts(getRandomPhones(),getRandomAddress(),
                getRandomEmails())));
        dtoImp.addEmployee(employer);
        System.out.println(dtoImp.getById(1L)); */

Employer employer = new Employer("fff", "ffff", "fdfdfd", new Date(System.currentTimeMillis() ));
EmployerContacts contacts = new EmployerContacts("555", "ddfdd", "ddfdd");
        EmployerContacts contacts2 = new EmployerContacts("555", "ddfdd", "ddfdd");
        employer.setContacts(List.of(contacts,contacts2));
        dtoImp.addEmployee(employer);
      //  cont.addContact(new EmployerContacts(getRandomPhones(),getRandomAddress(),
            //    getRandomEmails()));
      //  cont.addContact(new EmployerContacts(getRandomPhones(),getRandomAddress(),
            //    getRandomEmails()));

      // System.out.println(cont.getById(1L));
      //  System.out.println(cont.getById(8L));
       //dtoImp.getAll();

      //  dtoImp.updateEmployer(2L);
       // System.out.println(dtoImp.getById(2L));
      //  System.out.println(new Date(System.currentTimeMillis()));
       // System.out.println(new Date(new Date().getTime()));

      //  java.util.Date utilDate = new java.util.Date();
      //  java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
      //  System.out.println(sqlDate);

        // dtoImp.getAll();
        //  dtoImp.getAllEmployes();
        //System.out.println( dtoImp.getAllEmployes());
//dtoImp.getEmpById(3L);
         System.out.println(dtoImp.getById(1L));

    }
}