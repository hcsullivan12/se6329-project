package edu.utd.se6329.cometbooks;

public class Payment
{
    private double price;
    private String sellerName;
    private String buyerName;
    private String date;
    private String textbookName;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Payment(String sellerName, String buyerName, String date, String textbookName, double price) {
        this.sellerName = sellerName;
        this.buyerName = buyerName;
        this.date = date;
        this.textbookName = textbookName;
        this.price = price;
    }
    
    public void createTransaction() {
        Transaction transaction = new Transaction();
    }
}