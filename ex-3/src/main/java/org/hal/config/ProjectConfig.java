package org.hal.config;

import org.hal.entity.entity.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "org.hal.entity")
public class ProjectConfig {

    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Ki Ki");
        return p;
    }

    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Mi Mi");
        return p;
    }

    @Bean
    public Parrot parrot3() {
        Parrot p = new Parrot();
        p.setName("Ci Ci");
        return p;
    }

//    @Bean
//    public Person person() {
//        Person p = new Person();
//        p.setName("Ko Ko");
//        p.setParrot(parrot());
//        return p;
//    }

//    @Bean
//    public Person person(Parrot parrot) {
//        Person p = new Person();
//        p.setName("Jo Jo");
//        p.setParrot(parrot);
//        return p;
//    }

}
