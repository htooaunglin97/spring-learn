package org.hal;


import org.hal.config.ProjectConfig;
import org.hal.entity.entity.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person par = context.getBean(Person.class);

        System.out.println(par.getParrot().getName());

    }
}