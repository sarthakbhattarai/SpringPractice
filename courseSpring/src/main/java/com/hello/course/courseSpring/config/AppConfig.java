package com.hello.course.courseSpring.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.hello.course.courseSpring")
public class AppConfig {

//    @Bean
//    public Alien alien(@Qualifier("action") Computer com){
//        Alien alien = new Alien();
//        alien.setCom(com);
//        return alien;
//    }
//
//    @Bean
//    public Desktop action(){
//        return new Desktop();
//    }
//    @Bean(name="lap")
//    public Laptop lap(){
//        return new Laptop();
//    }
}
