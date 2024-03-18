package com.study;

import com.study.dto.EmployerDtoImp;
import com.study.entity.Employer;
import com.study.storage.DatabaseInitService;
import com.study.storage.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class App {
    public static void main(String[] args) {


        EmployerDtoImp dtoImp = new EmployerDtoImp();
        dtoImp.getAll();
       System.out.println( dtoImp.getAllEmployes());
       dtoImp.getEmpById(3L);

    }
}