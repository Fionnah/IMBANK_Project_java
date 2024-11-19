/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Jasper
 */
public class CardInfo {
    private Long cardNumber;
    private int cardPIN;
    private int accountNumberID;

    public CardInfo(Long cardNumber, int cardPIN, int accountNumberID) {
        this.cardNumber = cardNumber;
        this.cardPIN = cardPIN;
        this.accountNumberID = accountNumberID;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardPIN() {
        return cardPIN;
    }

    public void setCardPIN(int cardPIN) {
        this.cardPIN = cardPIN;
    }

    public int getAccountNumberID() {
        return accountNumberID;
    }

    public void setAccountNumberID(int accountNumberID) {
        this.accountNumberID = accountNumberID;
    }
}
