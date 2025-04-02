package com.prasanth.javaSpringBootPractice.practiceSpring.leve2.concepts;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ApplicationRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        String[] beans = context.getBeanDefinitionNames();
        System.out.println("Printing Beans:");
        for(var bean: beans){
            System.out.println(bean);
        }
        System.out.println("Round2:");
        Arrays.stream(beans).forEach(System.out::println);

        System.out.println("Printing values:");

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("Sai"));
        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean("personQualifieraddr"));
    }
}
