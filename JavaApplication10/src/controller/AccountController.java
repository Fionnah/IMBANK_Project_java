/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import service.AccountServiceImpl;
/**
 *
 * @author Jasper
 */
public class AccountController {
    
    private final AccountServiceImpl accountService;
    
    public AccountController(AccountServiceImpl accountService){
        this.accountService = accountService;
    }
    
    public Double showBalance(String bankAccountNumberID){
        return 0.00;
    }
    
    public Boolean handleDeposit(String bankAccountNumberID, Double amount){
        return false;
    }
    
    public Boolean handleWithdrawal(String bankAccountNumberID, Double amount){
        return false;
    }
}
