package com.study.utils;

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
}
