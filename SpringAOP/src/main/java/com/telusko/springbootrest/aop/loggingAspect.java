package com.telusko.springbootrest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class loggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(loggingAspect.class);

    //return type, class name.method name(args)
    @Before("execution(* com.telusko.springbootrest.service.JobService.*(..))")
    public void logMethodCall(JoinPoint jp){
        LOGGER.info("Method Called"+jp.getSignature().getName());
    }



    @After("execution(* com.telusko.springbootrest.service.JobService.*(..))")
    public void logMethodExecuted(JoinPoint jp){
        LOGGER.info("Method Called after"+jp.getSignature().getName());
    }


    @AfterThrowing("execution(* com.telusko.springbootrest.service.JobService.*(..))")
    public void logMethodCrash(JoinPoint jp){
        LOGGER.info("Method Called after exception"+jp.getSignature().getName());
    }


    @AfterReturning("execution(* com.telusko.springbootrest.service.JobService.*(..))")
    public void logMethodSuccess(JoinPoint jp){
        LOGGER.info("Method Called after success"+jp.getSignature().getName());
    }








}
