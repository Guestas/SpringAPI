package com.mc.springboot.SpringAPI.common;

import org.springframework.stereotype.Component;

@Component //makes available for dependency injection
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Do something practise Cricket";
    }

}
