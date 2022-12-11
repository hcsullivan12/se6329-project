package edu.utd.se6329.cometbooks;

public class Textbook {
    private String name;
    private String author;
    private String ISBN;
    
    public Textbook(String name, String author, String ISBN) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getISBN() {
        return ISBN;
    }
}
