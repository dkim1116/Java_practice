package com.danielkim1116;

/**
 * Created by danielkim on 6/25/16.
 */
public class bank_Account {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    public void withdrawal(double withdrawAmount) {
        if (balance - withdrawAmount <= 0) {
            System.out.println("YOU DONT HAVE ENOUGH! BALANCE: " + balance);
        } else {
            balance -= withdrawAmount;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
