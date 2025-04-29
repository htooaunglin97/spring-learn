/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hal.aspects.config;


import com.hal.aspects.comment.aspects.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *
 * @author HP
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.hal.aspects"})
public class ProjectConfig {
   
    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
    
}
