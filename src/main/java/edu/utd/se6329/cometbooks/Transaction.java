package edu.utd.se6329.cometbooks;

import java.util.Date;

public class Transaction
{
    private String transactionDate;
    private String buyerName;
    private String sellerName;
    private double amount;
    
    public Transaction(String sellerName, String buyerName, String transactionDate, double amount) {
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.sellerName = sellerName;
        this.buyerName = buyerName;
        createRecord();
    }
    
    public void createRecord() {
        TransactionRecord transactionRecord = new TransactionRecord(this.sellerName,this.buyerName,this.transactionDate, this.amount);
        transactionRecord.saveRecordInDB();
    }
}
