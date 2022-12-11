package edu.utd.se6329.cometbooks;

import java.util.ArrayList;

//Singleton class
public class MessageDB
{
    private Student sender;
    private Student receiver; 
    ArrayList<MessageRecord> messageQ;

    private MessageDB() {
        messageQ = new ArrayList<>();
    }
    
    public void save(MessageRecord messageRecord) {
        messageQ.add(messageRecord);
        System.out.println("Message record added to DB!!!");
    }

    public static MessageDB messageDBInstance = null;

    public static MessageDB getInstance(){
        if(messageDBInstance == null) messageDBInstance = new MessageDB();
        return messageDBInstance;
    }
}
