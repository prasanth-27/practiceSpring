package com.prasanth.javaSpringBootPractice.practiceSpring.leve2.concepts;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {
    @Bean
    public int age(){
        return 27;
    }

    @Bean
    public String name(){
        return "Prasanth";
    }

    @Bean(name = "Sai")
    public String name2(){
        return "Sai";
    }

    @Bean
    public Address address1(){
        return new Address("PTC", "Hyd");
    }

    @Bean
    @Qualifier(value = "HYDADDR")
    public Address address2(){
        return new Address("Hyd", "TG");
    }
    @Bean
    @Primary
    public Person personDefault(){
        return new Person("sai", 27, new Address("ptc", "hyd"));
    }

    @Bean
    public Person personWithValues(){
        return new Person(name(), age(), address1());
    }

    @Bean
    public Person personQualifieraddr(@Qualifier("Sai") String name, int age, @Qualifier(value = "HYDADDR") Address address){
        return new Person(name, age, address);
    }
}
