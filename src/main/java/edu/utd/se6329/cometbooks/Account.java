package edu.utd.se6329.cometbooks;

public class Account
{
    private String username;
    private String password;
    private String name;
    
    public Account(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public String getUsername(){ 
        return username;
    }

    public String getPassword(){
        return password;
    }

    public String getName(){
        return name;
    }
}
