package com.constructo.expo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/data")
public class DataCollectionController {
    @GetMapping("/demo")
    public String getMethodName() {
        return "Hello Render";
    }
    
	
}
