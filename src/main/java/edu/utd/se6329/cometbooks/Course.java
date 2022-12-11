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

    public void addTextbook(Textbook textbook) {
        this.textbooks.add(textbook);
    }
    
    public void removeTextbook(Textbook textbook) {
        this.textbooks.remove(textbook);
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
