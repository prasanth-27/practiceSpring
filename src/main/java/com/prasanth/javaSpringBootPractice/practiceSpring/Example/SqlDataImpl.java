package com.prasanth.javaSpringBootPractice.practiceSpring.Example;

import jakarta.inject.Named;
import org.springframework.context.annotation.Primary;

@Named
@Primary
public class SqlDataImpl implements DataInterface{
    @Override
    public int[] retrieveData() {
        return new int[] { 1, 2, 3, 4, 5 };
    }
}
