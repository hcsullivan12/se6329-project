package edu.utd.se6329.cometbooks;

import java.util.Date;

public class User
{
    private String netId;
    private String name;
    private String dob;
    private ArrayList<Textbook> textbookSold;
    public User(String netId, String name, String dob) {
        this.netId = netId;
        this.name = name;
        this.dob = dob;
    }

    public User(String netId, String name) {
        this.netId = netId;
        this.name = name;
    }
    public void update(String netId, String name, String dob) {
        this.netId = netId;
        this.name = name;
        this.dob = dob;
    }

    public void setTextbookSold(ArrayList<Textbook> textbookList){
        this.textbookSold = textbookList;
    }
    public void createSeller() {}
    
    public void createRecord() {
        UserRecord userRecord = new UserRecord(this.netId,this.name,this.dob);
        userRecord.setTextbookSold(this.textbookSold);
        userRecord.saveRecordInDB();
    }
}
