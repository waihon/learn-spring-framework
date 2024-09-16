package com.waihon.learnspringframework.enterprise.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService {
    // Field dependency injection using reflection
    @Autowired
    private DataService dataService;

    public long calculateSum() {
        List<Integer> data = dataService.getDate();
        return data.stream().reduce(Integer::sum).get();
    }
}
