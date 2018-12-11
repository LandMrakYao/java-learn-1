package org.xxs.javalearn.web;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public String test(){
        return "test";
    }

}
