package edu.utd.se6329.cometbooks;

public class Message
{
    private Student sender;
    private Student receiver; 
    private String payload;

    public Message(String sender, String receiver, String payload) {
        this.sender = sender;
        this.receiver = receiver;
        this.payload = payload;
        dispatchMessage();
    }
    
    public void dispatchMessage() {
        MessageRecord messageRecord = new MessageRecord(sender, receiver, payload);
    }
    
    public void createRecord() {
        
    }
}
