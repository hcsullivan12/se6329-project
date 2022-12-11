package edu.utd.se6329.cometbooks;

import java.util.Date;

public class UserRecord extends User
{
    private String netId;
    private String name;
    private String dob;
    private ArrayList<Textbook> textbookSold;
    public UserRecord(String netId, String name, String dob) {
        this.netId = netId;
        this.name = name;
        this.dob = dob;
    }

    public UserRecord(String netId, String name) {
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

    public void saveRecordInDB() {
        UserDB userDB = UserDB.getInstance();
        userDB.save(this);
    }
}
