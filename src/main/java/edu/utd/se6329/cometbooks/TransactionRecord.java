package edu.utd.se6329.cometbooks;

import java.util.Date;

public class TransactionRecord extends Transaction
{
    private String transactionDate;
    private double amount;
    private String sellerName;

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    private String buyerName;
    
    public TransactionRecord(String sellerName, String buyerName, String transactionDate, double amount) {
        this.transactionDate = transactionDate;
        this.sellerName = sellerName;
        this.buyerName = buyerName;
        this.amount = amount;
    }
    
    public void saveRecordInDB() {
        TransactionDB transactionDB = TransactionDB.getInstance(this.sellerName, this.buyerName, this.transactionDate, this.amount);
        transactionDB.save(this);
    }
}
