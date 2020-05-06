package com.diandian.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ControllerTest {

	
    @GetMapping(value="/hello")
    public String getHello() {
        return "hello,jenkins_test!";
    }
    
    @GetMapping(value="/hello1")
    public String getHello1() {
        return "sqx,jenkins_test!";
    }
    
    @GetMapping(value="/hello2")
    public String getHello2() {
        return "sqx88,jenkins_test!2";
    }
    
    @GetMapping(value="/hello3")
    public String getHello3() {
        return "sqx88,jenkins_test!3";
    }
    
    @GetMapping(value="/hello4")
    public String getHello4() {
        return "sqx88,jenkins_test!3";
    }
    
}
