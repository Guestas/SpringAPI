package com.mc.springboot.SpringAPI.common;

import org.springframework.stereotype.Component;
@Component
public class BasketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Do something practise basket";
    }
}
