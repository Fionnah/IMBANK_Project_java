/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;
import model.Transaction;

/**
 *
 * @author Jasper
 */
public class TransactionRepository {
    
    
    
    public Boolean saveTransaction(Transaction transaction){
        return false;
    }
    
    public Transaction getTransactionByID(String transactionID){
        Transaction transaction = new Transaction();
        return transaction;
    }
    
    public List<Transaction> getTransactionsByAccount(String transactionID){
        List<Transaction> transactions = null;
        return transactions;
    }
}
