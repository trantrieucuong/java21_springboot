package com.example.bookcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.bookcontroller.service"})


public class BookControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookControllerApplication.class, args);
    }

}
