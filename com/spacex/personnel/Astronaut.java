// Astronaut.java
// Jasmine Lewis 
// 8/10/23
// class representing an astronaut

package com.spacex.personnel;

import java.time.LocalDateTime;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Period;

public class Astronaut {
    private double height;
    private double weight;
    private LocalDate arrival;
    private Period stayLength;
    private LocalDate estimatedReturn;

public class Astronaut {
    private String name;
    private double heightCm;  // height in centimeters
    private double weightKg;  // weight in kilograms
    private LocalDateTime arrival; // arrival date/time
    
    // overload, create an astronaut with specified name, height, and weight
    public Astronaut(String name, double heightCm, double weightKg,
                     LocalDateTime arrival) {
        this.name = name;
    this.height = height;
    this.weight = weight;
    this.arrival = arrival;
    this.stayLength = stayLength;
    this.estimatedReturn = estimatedReturn;
    }
    
    @Override
public String toString() {
    return "name: " + name + "\n"
            + "height: " + height + " (cm)\n"
            + "weight: " + weight + " (kg)\n"
            + "arrival: " + arrival + "\n"
            + "stay length: " + stayLength.getDays() + " days\n"
            + "est. return " + estimatedReturn;
    }
}
