package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class CarApplication {

    LocalTime time;
    String season;

    public CarApplication(String season, LocalTime time) {
        this.time = time;
        this.season = season;
    }

    public LocalTime getTime() {
        return time;
    }

    @Bean
    public Car choseCar() {
        Car car;
        if (season.equals("winter")) {
            return car = new SUV();
        } else if (season.equals("spring") || season.equals("autumn")) {
            return car = new Sedan();
        } else if (season.equals("summer")) {
            return car = new Cabrio();
        } return null;
    }


    public static void main(String[] args) {

        LocalTime time2 = LocalTime.of(05,22);

        CarApplication application = new CarApplication("summer", time2);

        System.out.println(application.choseCar().getCarType());
        System.out.println(application.choseCar().hasHeadlightsTurnedOn(application.getTime()));
    }
}
