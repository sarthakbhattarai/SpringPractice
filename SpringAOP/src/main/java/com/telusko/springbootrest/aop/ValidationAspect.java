package com.telusko.springbootrest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class ValidationAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(ValidationAspect.class);


    @Around("execution(* com.telusko.springbootrest.service.JobService.getJob(..))&& args(postId)")
    public Object validationCheck(ProceedingJoinPoint jp,int postId) throws Throwable {

        if(postId<0){
            LOGGER.info("postid is negativer "+postId);
            postId=-postId;
        }

        Object obj=jp.proceed(new Object[]{postId});

        return obj;
    }

}
