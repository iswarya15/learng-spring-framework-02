package com.in28minutes.exercise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService{

    public int[] retrieveData() {
        return new int[] {1,2,3,4,5,6,7};
    }
}
