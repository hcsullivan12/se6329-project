package edu.utd.se6329.cometbooks;

import java.util.Date;

//Singleton class
public class TransactionDB
{
    ArrayList<Transaction> transactionDB;

    private Transaction() {
        transactionDB = new ArrayList<>();
    }
    
    public void save(TransactionRecord transactionRecord){
        transactionDB.add(transactionRecord);
        System.out.println("Transaction added to DB!!!");
    }

    public static TransactionDB transactionDBInstance = null

    public static TransactionDB getInstance(){
        if(transactionDBInstance == null) transactionDBInstance = new TransactionDB();
        return transactionDBInstance;
    }
}
