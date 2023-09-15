package com.mc.springboot.SpringAPI.restAPI;

import com.mc.springboot.SpringAPI.common.Coach;
import com.mc.springboot.SpringAPI.common.CricketCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NRestController {


    // just "/" return hello world
    @GetMapping("/")
    public String defWindow(){
        return "App is running!";
    }

    // new endpoin for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run 5k";
    }

    //inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: %s Team name: %s".formatted(coachName, teamName);
    }


    private Coach myCoach;
    @Autowired //it will find class and create new coach if more coaches just use Qualifier
    public void DemoControler(@Qualifier("basketCoach") Coach theCoach){
        myCoach = theCoach;
    }

    private Coach myCoach2;
    @Autowired //it will find class and create new coach if more coaches just use Qualifier or set primary in class Cricket Coach
    public void DemoControler2( CricketCoach theCoach){
        myCoach2 = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getdWork(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/dailyworkout2")
    public String getdWork2(){
        return myCoach2.getDailyWorkout();
    }

}
