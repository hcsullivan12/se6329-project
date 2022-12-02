package edu.utd.se6329.cometbooks;

import java.util.Date;

public class User
{
    private String netId;
    private String name;
    private Date dob;
    
    public User(String netId, String name, Date dob) {
        this.netId = netId;
        this.name = name;
        this.dob = dob;
    }
    
    public void update(String netId, String name, Date dob) {
        this.netId = netId;
        this.name = name;
        this.dob = dob;
    }
    
    public void createSeller() {}
    
    public void createRecord() {}
}
