package edu.utd.se6329.cometbooks;

public class MessageRecord
{
    private Student sender;
    private Student receiver; 
    private String payload;

    public MessageRecord(Student sender, Student receiver, String payload) {
        this.sender = sender;
        this.receiver = receiver;
        this.payload = payload;
    }
    
    public void createRecord() {
        MessageDB messageDB = MessageDB.getInstance();
        messageDB.save(this);
    }
}
