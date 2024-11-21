/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.Transaction;
import repository.TransactionRepository;

/**
 *
 * @author Jasper
 */
interface TransactionService{
    Boolean processTransaction(Transaction transaction);
    List<Transaction> getTransactionHistory(String bankAccountNumberID);
}

public class TransactionServiceImpl implements TransactionService{

    private final TransactionRepository transactionRepository;
    
    public TransactionServiceImpl(TransactionRepository transactionRepository){
        this.transactionRepository = transactionRepository;
    }
    
    @Override
    public Boolean processTransaction(Transaction transaction) {
        return false;
    }

    @Override
    public List<Transaction> getTransactionHistory(String bankAccountNumberID) {
        List<Transaction> list = null;
        return list;
    }
}
