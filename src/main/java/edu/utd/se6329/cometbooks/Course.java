package edu.utd.se6329.cometbooks;

import java.util.Date;

public class Course
{
    private String name;
    private String number;
    private Date timings;

    public Course(String name, String number, Date timings) {
        this.name = name;
        this.number = number;
        this.timings = timings;
    }
}
