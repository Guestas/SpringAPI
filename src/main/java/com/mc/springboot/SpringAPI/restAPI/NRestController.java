package com.mc.springboot.SpringAPI.restAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NRestController {
    // just "/" return hello world
    @GetMapping("/")
    public String defWindow(){
        return "App is running!";
    }

}
