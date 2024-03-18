package com.study;

import com.study.dto.EmployerDtoImp;
import com.study.entity.Employer;

import java.sql.Date;


public class App {
    public static void main(String[] args) {

        EmployerDtoImp dtoImp = new EmployerDtoImp();
       // dtoImp.getAll();
        //System.out.println( dtoImp.getAllEmployes());
//dtoImp.getEmpById(3L);
       // System.out.println(dtoImp.getById(2L));

        Employer employer1 = new Employer("Jordan", "playing", "basketball", new Date(System.currentTimeMillis()));
        Employer employer = new Employer();
        dtoImp.addEmployee(employer);

      //  dtoImp.getAll();

    }
}