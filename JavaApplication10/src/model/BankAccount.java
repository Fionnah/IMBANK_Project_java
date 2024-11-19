/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author Jasper
 */
public class BankAccount {
    private int accountNumberID;
    private int customerID;
    private String accountType;
    private float accountBalance;
    private Date dateOpened;
    private Date dateClosed;

    public BankAccount(int accountNumberID, int customerID, String accountType, float accountBalance, Date dateOpened, Date dateClosed) {
        this.accountNumberID = accountNumberID;
        this.customerID = customerID;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
        this.dateOpened = dateOpened;
        this.dateClosed = dateClosed;
    }

    public int getAccountNumberID() {
        return accountNumberID;
    }

    public void setAccountNumberID(int accountNumberID) {
        this.accountNumberID = accountNumberID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Date getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(Date dateOpened) {
        this.dateOpened = dateOpened;
    }

    public Date getDateClosed() {
        return dateClosed;
    }

    public void setDateClosed(Date dateClosed) {
        this.dateClosed = dateClosed;
    }
    
    
}
