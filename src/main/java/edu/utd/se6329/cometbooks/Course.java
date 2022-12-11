package edu.utd.se6329.cometbooks;

import java.util.Date;

public class Course {
    private String name;
    private String number;
    private ArrayList<Textbook> textbooks;

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

    public String getNumber(){
        return number;
    }

    public ArrayList<Textbook> getTextbooks(){
        return textbooks;
    }
}
