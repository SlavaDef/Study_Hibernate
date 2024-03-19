package com.study.utils;

import java.util.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Utils { // class gets random names, departments and projects

    public static String getRandomName(){
        List<String> list = Arrays.asList("Boris Jonson", "Junior Second", "Kait Midelton", "Ormando Banuchi",
                "Boby Faraday","Pablo Eskobar","Kristy K","Amanda Urega","Sofi Terner");
        return list.get(ThreadLocalRandom.current().nextInt(9));
    }

    public static String getRandomDepartment(){
        List<String> list = Arrays.asList("Service of the Minister", "It_dep", "OF INTERNAL AUDIT", "of testing games",
                "of integration","of comunity","of money","of police","of logick");
        return list.get(ThreadLocalRandom.current().nextInt(9));
    }

    public static String getRandomProject(){
        List<String> list = Arrays.asList("project_1", "project_2", "project_3", "project_4",
                "project_5","6","project_7","project_8","project_9");
        return list.get(ThreadLocalRandom.current().nextInt(9));
    }

    public static String getRandomPhones(){
        List<String> list = Arrays.asList("+38099-050-44-12", "+38099-055-44-12", "+38099-050-35-46", "+38099-050-12-12",
                "+38099-050-97-35","+38099-050-81-31","+38099-050-88-11","+38099-050-78-195","+38099-050-11-11");
        return list.get(ThreadLocalRandom.current().nextInt(9));
    }

    public static String getRandomAddress(){
        List<String> list = Arrays.asList("St.Djon street 3", "St.Bob street 45", "Junior street 12", "Games street 66",
                "Devil street 44","Armstrong street 15","Junior street 36","Jesus street 19","Tom.J.D street 28");
        return list.get(ThreadLocalRandom.current().nextInt(9));
    }

    public static String getRandomEmails(){
        List<String> list = Arrays.asList("Sidni@gmail.com", "Teg@gmail.com", "Archi234@gmail.com", "player66@gmail.com",
                "BigBoss@gmail.com","Junior23@gmail.com","Alfa33@gmail.com","KillBill1@gmail.com","234A5@gmail.com");
        return list.get(ThreadLocalRandom.current().nextInt(9));
    }


    public static Timestamp getRandomTimestamp(){
        return new Timestamp(
                ThreadLocalRandom.current()
                        .nextLong(new Date(0).getTime(), new Date().getTime())
        );
    }
}
