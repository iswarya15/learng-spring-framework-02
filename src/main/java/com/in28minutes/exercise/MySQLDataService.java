package com.in28minutes.exercise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService{

    public int[] retrieveData() {
        return new int[] {11,22,33,44,55,66,77};
    }
}
