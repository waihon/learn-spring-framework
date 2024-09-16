package com.waihon.learnspringframework.enterprise.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {

    // @Autowired is not required when using setter-based dependency injection
    private BusinessService businessService;

    // Setter-based dependency injection
    @Autowired
    public void setBusinessService(BusinessService businessService) {
        this.businessService = businessService;
    }

    public long returnValueFromBusinessService() {
        return businessService.calculateSum();
    }
}
