package com.prasanth.javaSpringBootPractice.practiceSpring.leve2.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.prasanth.javaSpringBootPractice.practiceSpring.leve2.game")
public class GamingConsoleLauncher {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GamingConsoleLauncher.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println(context.getBean("pacMan"));

        context.getBean(GameRunner.class).run();
    }
}
