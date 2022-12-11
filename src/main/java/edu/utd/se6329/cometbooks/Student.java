package edu.utd.se6329.cometbooks;

import java.util.Date;

public class Student extends User {
    private Account studentAccount = null;
    private String dob = null;

    public Student(String uname, String pwd, String netid) {
        super(netid, uname);
        studentAccount = new Account(uname, pwd, netid);
    }
    public void update(String dob){
        this.dob = dob;
    }

}
