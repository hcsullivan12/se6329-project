package edu.utd.se6329.cometbooks;
import java.util.ArrayList;

public class UserRecord extends User
{
    private String netId;
    private String name;
    private String dob;
    private ArrayList<Textbook> textbookSold;
    
    public UserRecord(String netId, String name, String dob) {
        super(netId, name, dob);
        this.netId = netId;
        this.name = name;
        this.dob = dob;
    }

    public UserRecord(String netId, String name) {
        super(netId, name);
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

    @Override
    public String getNetId() {
        return netId;
    }

    @Override
    public void setNetId(String netId) {
        this.netId = netId;
    }
}
