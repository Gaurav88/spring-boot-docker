package com.example.springbootdocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerRestController {

    @RequestMapping("/")
    public String getMessage(){
        return "Hello";
    }
}
