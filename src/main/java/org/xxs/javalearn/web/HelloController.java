package org.xxs.javalearn.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/test")
    public String test(String id){

        System.out.println("abc");


        return "test";
    }

}
