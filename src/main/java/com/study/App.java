package com.study;

import com.study.crud.EmployerDtoImp;
import com.study.entity.Employer;




public class App {
    public static void main(String[] args) {

        EmployerDtoImp dtoImp = new EmployerDtoImp();
        dtoImp.creatingEmployers(9);
        dtoImp.getAll();
        System.out.println(dtoImp.getById(6L));

        // dtoImp.getAll();
        //  dtoImp.getAllEmployes();
        //System.out.println( dtoImp.getAllEmployes());
//dtoImp.getEmpById(3L);
        // System.out.println(dtoImp.getById(2L));

    }
}