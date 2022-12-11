package edu.utd.se6329.cometbooks;

public class Account
{
    private String username;
    private String password;
    private String name;
    private String netid;
    public Account(String username, String password, String netid) {
        this.username = username;
        this.password = password;
        this.netid = netid;
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
