package com.waihon.learnspringframework.enterprise.example;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataService {
    public List<Integer> getDate() {
        return Arrays.asList(10, 20, 30, 40);
    }
}
