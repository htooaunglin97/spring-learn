/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hal.aspects.comment.aspects;

import com.hal.aspects.comment.entities.Comment;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 *
 * @author HP
 */
@Aspect
public class LoggingAspect {
    
    private static final Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    
//    @Around("execution(* com.hal.aspects.comment.services.*.*(..))")
//    public void log(ProceedingJoinPoint joinPoint) {
//        try {
//            logger.info("Method will execute");
//            joinPoint.proceed();
//            logger.info("Method executed");
//        } catch (Throwable ex) {
//            Logger.getLogger(LoggingAspect.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    @Around("execution(* com.hal.aspects.comment.services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object [] arguments = joinPoint.getArgs(); 
        logger.info("Method " + methodName + 
        " with parameters " + Arrays.asList(arguments) +
        " will execute");
        
        Comment comment = new Comment("Hacker", "Hack news");
        Object [] newArguments = {comment};
        joinPoint.proceed(newArguments);
//        Object returnedByMethod = joinPoint.proceed(newArguments);
        logger.info("Method executed");
        return "FAILED";
    }
    
}
