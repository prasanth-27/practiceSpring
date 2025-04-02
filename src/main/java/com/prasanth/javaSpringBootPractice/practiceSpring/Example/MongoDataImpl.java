package com.prasanth.javaSpringBootPractice.practiceSpring.Example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MongoDataImpl implements DataInterface{

    @PostConstruct
    private void setup(){
        System.out.println("Post-constructor");
    }
    @Override
    public int[] retrieveData() {
        return new int[] { 11, 22, 33, 44, 55 };
    }

    @PreDestroy
    private void teardown(){
        System.out.println("Pre-destroy");
    }
}
