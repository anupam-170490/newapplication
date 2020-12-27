package com.example.one.deploy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployController {
	@RequestMapping("/hello")
    public String hello() {
        return "Hello World RESTful";
    } 
}
