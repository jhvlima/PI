package com.example.demo;

import java.time.LocalDateTime;

public class Greeting {
    private String name;
    private LocalDateTime dateTime;
    private String greeting;

    public Greeting(String name, LocalDateTime dateTime) {
        this.name = name;
        this.dateTime = dateTime;
        int hour = dateTime.getHour();
        greeting = (hour < 6) ? "Good night!"
                : (hour < 12) ? "Good morning!"
                        : (hour < 18) ? "Good afternoon!"
                                : "Good evening!";

    }

    /* getName(), getDateTime(), getGreeting() */
    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public String getGreeting() {
        return greeting;
    }
    public String getName() {
        return name;
    }
}