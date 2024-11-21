/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.Transaction;
import service.TransactionServiceImpl;

/**
 *
 * @author Jasper
 */
public class TransactionController {
    
    private final TransactionServiceImpl transactionService;
    
    public TransactionController(TransactionServiceImpl transactionService){
        this.transactionService = transactionService;
    }
    public Boolean initiateTransaction(Transaction transaction){
        return false;
    }
    
    public List<Transaction> showTransactionHistory(String bankAccountNumberID){
        List<Transaction> list = null;
        return list;
    }
}
