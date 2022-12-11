package edu.utd.se6329.cometbooks;

public class MessageRecord extends Message
{
    private String sender;
    private String receiver;
    private String payload;

    public MessageRecord(Student sender, Student receiver, String payload) {
        super("fixme", "fixme", payload);
        createRecord();
    }

    public void createRecord() {
        MessageDB messageDB = MessageDB.getInstance();
        messageDB.save(this);
    }
}
