package com.prasanth.javaSpringBootPractice.practiceSpring.Example;

import jakarta.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

//@Component
@Service
public class BusinessLogicService {

    //@Inject
    //@Autowired
    private DataInterface data;

    @Inject
    BusinessLogicService(@Qualifier("mongoDataImpl") DataInterface data){
        this.data = data;
    }

    public void getData(){
        Arrays.stream(data.retrieveData()).forEach(System.out::println);
    }

    public void applyBusinessLogic(){
        System.out.println("Max Data is: " + Arrays.stream(data.retrieveData()).max());
    }
}
