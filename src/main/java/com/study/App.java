package com.study;

import com.study.crud.EmployerDtoImp;
import com.study.entity.Employer;

import java.sql.Date;
import java.util.concurrent.ThreadLocalRandom;

import static com.study.utils.Utils.getRandomTimestamp;


public class App {
    public static void main(String[] args) {

        EmployerDtoImp dtoImp = new EmployerDtoImp();
      //  dtoImp.creatingEmployers(9);
       // dtoImp.getAll();
      //  dtoImp.updateEmployer(2L);
       // System.out.println(dtoImp.getById(2L));
      //  System.out.println(new Date(System.currentTimeMillis()));
       // System.out.println(new Date(new Date().getTime()));

        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        System.out.println(sqlDate);

        // dtoImp.getAll();
        //  dtoImp.getAllEmployes();
        //System.out.println( dtoImp.getAllEmployes());
//dtoImp.getEmpById(3L);
        // System.out.println(dtoImp.getById(2L));

    }
}