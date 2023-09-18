package org.example;

import org.example.entities.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.setProperty("spring.profiles.active", "eu, af, sa");
        ApplicationContext ac1 = new ClassPathXmlApplicationContext("beans.xml");
        //Country ire = (Country) ac1.getBean("ireland");
        //Country esp = (Country) ac1.getBean("spain");
        //Country fra = (Country) ac1.getBean("france");
        //Country nig = (Country) ac1.getBean("nigeria");
        //Country egy = (Country) ac1.getBean("egypt");
        ac1.getBeansOfType(Country.class).forEach((k, v)-> System.out.println(k + ": " + v));

        ApplicationContext ac2 = new AnnotationConfigApplicationContext(Beans.class);
        ac2.getBeansOfType(Country.class).forEach((k, v)-> System.out.println(k + ": " + v));
    }
}