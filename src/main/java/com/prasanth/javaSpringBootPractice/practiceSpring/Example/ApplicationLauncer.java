package com.prasanth.javaSpringBootPractice.practiceSpring.Example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ApplicationLauncer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationLauncer.class);

        ctx.getBean(BusinessLogicService.class).getData();
        ctx.getBean(BusinessLogicService.class).applyBusinessLogic();

        //Singleton scope beans
        System.out.println(ctx.getBean("sqlDataImpl"));
        System.out.println(ctx.getBean("sqlDataImpl"));

        //Prototype Scope Beans
        System.out.println(ctx.getBean("mongoDataImpl"));
        System.out.println(ctx.getBean("mongoDataImpl"));
    }
}
