package com.payment.response;

import com.payment.enums.CardType;

public class CustomerResponse {
    private String fname;
    private String lname;
    private CardType cardType;
    private double amount;
    private boolean transactionStatus;

    public CustomerResponse() {
    }

    public CustomerResponse(String fname, String lname, CardType cardType, double amount, boolean transactionStatus) {
        this.fname = fname;
        this.lname = lname;
        this.cardType = cardType;
        this.amount = amount;
        this.transactionStatus = transactionStatus;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(boolean transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
}
