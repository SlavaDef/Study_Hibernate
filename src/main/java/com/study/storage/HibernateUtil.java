package com.study.storage;

import lombok.Getter;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    // налаштовуємо все в конструкторі обгортаємо в сінгелтон
    private static final HibernateUtil INSTANCE;

    @Getter
    private SessionFactory sessionFactory;

    static { // ініціалізуємо в статиці щоб зайвий раз не викликати сінгелтон
        INSTANCE = new HibernateUtil();
    }

    private HibernateUtil() { // приватний конструктор створює обьект і там ми вже конфігуруємо його
        sessionFactory = new Configuration()
                .addAnnotatedClass(Employer.class) // додаємо клас з яким працюємо
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
