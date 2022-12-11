package edu.utd.se6329.cometbooks;

import java.util.Date;

public class TransactionRecord
{
    private String transactionDate;
    private double amount;
    private String sellerName;
    private String buyerName;
    
    public TransactionRecord(String transactionDate, double amount, String sellerName, String buyerName) {
        this.transactionDate = transactionDate;
        this.sellerName = sellerName;
        this.buyerName = buyerName;
        this.amount = amount;
    }
    
    public void createRecord() {
        TransactionDB transactionDB = TransactionDB.getInstance();
        transactionDB.save(this);
    }
}
