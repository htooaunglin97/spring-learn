package org.hal.main.config;


import org.hal.main.entity.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//public class ProjectConfig {
//
//    @Bean(name="coco")
//    Parrot parrot1() {
//        Parrot p = new Parrot();
//        p.setName("CoCo");
//        return p;
//    }
//
//    @Bean
//    Parrot parrot2() {
//        Parrot p = new Parrot();
//        p.setName("Miki");
//        return p;
//    }
//
//    @Bean
//    Parrot parrot3() {
//        Parrot p = new Parrot();
//        p.setName("Rika");
//        return p;
//    }
//
//    @Bean
//    String hello() {
//        return "hello";
//    }
//
//    @Bean
//    Integer ten() {
//        return 10;
//    }
//}
@Configuration
@ComponentScan(basePackages = "org.hal.main.entity")
public class ProjectConfig {

}
