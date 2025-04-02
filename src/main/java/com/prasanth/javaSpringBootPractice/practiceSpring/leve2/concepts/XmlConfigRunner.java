package com.prasanth.javaSpringBootPractice.practiceSpring.leve2.concepts;

import com.prasanth.javaSpringBootPractice.practiceSpring.leve2.game.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XmlConfigRunner {

    public static void main(String[] args) {

        try (var context =
                     new ClassPathXmlApplicationContext("BeanXmlConfig.xml")) {

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean("name"));

            System.out.println(context.getBean("age"));

            context.getBean(GameRunner.class).run();

        }
    }
}
