package edu.utd.se6329.cometbooks;

import java.util.ArrayList;

public class Course {
    private String name;
    private String number;
    private ArrayList<Textbook> textbooks;

    public void setNumber(String number) {
        this.number = number;
    }

    public Course(String name, String number) {
        this.name = name;
        this.number = number;
        textbooks = new ArrayList<Textbook>();
    }

    public void addTextbook(Course course) {
        this.textbooks.add(course);
    }
    
    public void removeTextbook(Course course) {
        this.textbooks.remove(course);
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber(){
        return number;
    }

    public ArrayList<Textbook> getTextbooks(){
        return textbooks;
    }
}
