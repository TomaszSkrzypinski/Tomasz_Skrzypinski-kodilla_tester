package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.util.Random;

@Configuration
public class CarApplication {

    LocalTime time= LocalTime.of(5,25);

    @Bean
    public Car choseCar() {
        LocalTime tstart = LocalTime.of(6, 0);
        LocalTime tstop = LocalTime.of(20,0);
        boolean headlightsOn;
        if (time.isAfter(tstart) && time.isBefore(tstop)) {
            headlightsOn = false;
        } else {
            headlightsOn = true;
        }
        Car car;
        Random random = new Random();
        int season = random.nextInt(3);
        if (season == 0) {
            return  new SUV(headlightsOn);
        } else if (season == 1 || season ==4) {
            return  new Sedan(headlightsOn);
        } else {
            return  new Cabrio(headlightsOn);
        }
    }
}
