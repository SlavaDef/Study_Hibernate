package com.study.storage;

import com.study.entity.EmployeeTask;
import com.study.entity.Employer;
import com.study.entity.EmpContacts;
import lombok.Getter;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class HibernateUtil {

    // налаштовуємо все в конструкторі обгортаємо в сінгелтон
    private static final HibernateUtil INSTANCE;

    @Getter
    private SessionFactory sessionFactory;

    static { // ініціалізуємо в статиці щоб зайвий раз не викликати сінгелтон
        INSTANCE = new HibernateUtil();
    }

    private HibernateUtil() { // приватний конструктор створює обьект і там ми вже конфігуруємо його
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
        properties.put(Environment.URL, "jdbc:mysql://localhost/hiber?serverTimezone=Europe/Kiev");
        properties.put(Environment.USER, "root");
        properties.put(Environment.PASS, "1234");
        properties.put(Environment.SHOW_SQL, "true");
        // properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        properties.put(Environment.HBM2DDL_AUTO, "create-drop");


        sessionFactory = new Configuration()
                //.configure("hibernate.properties")
                 .setProperties(properties)
                .addAnnotatedClass(Employer.class)// додаємо клас з яким працюємо
                .addAnnotatedClass(EmpContacts.class)
                .addAnnotatedClass(EmployeeTask.class)
                .buildSessionFactory();
    }

    // тут при зверненні визиває обьект і конфігурує все
    public static HibernateUtil getInstance() {
        return INSTANCE;
    }

// само не закриється треба очищати ресурси

    public void close() {
        sessionFactory.close();
    }
}
