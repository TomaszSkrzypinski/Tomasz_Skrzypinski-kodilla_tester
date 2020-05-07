package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.util.Random;

@Configuration
public class CarApplication {

    LocalTime time= LocalTime.of(05,25);

    @Bean
    public Car choseCar() {
        LocalTime tstart = LocalTime.of(06,00);
        LocalTime tstop = LocalTime.of(20,00);
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
            return car = new SUV(headlightsOn);

        } else if (season == 1 || season ==4) {
            return car = new Sedan(headlightsOn);
        } else {
            return car = new Cabrio(headlightsOn);
        }
    }
}
