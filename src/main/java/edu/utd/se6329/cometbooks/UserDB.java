package edu.utd.se6329.cometbooks;

import java.util.ArrayList;

//Singleton class
public class UserDB
{
    ArrayList<UserRecord> userDB;

    private UserDB() {
        userDB = new ArrayList<>();
    }

    public void save(UserRecord userRecord) {
        userDB.add(userRecord);
        System.out.println("User record added to DB!!!");
    }

    public static UserDB userDBInstance = null;

    public static UserDB getInstance(){
        if(userDBInstance == null) userDBInstance = new UserDB();
        return userDBInstance;
    }
}
