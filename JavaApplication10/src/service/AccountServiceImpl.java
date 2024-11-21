/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Jasper
 */
interface AccountService{
    Double getAccountBalance(String bankAccountNumberID);
    Boolean deposit(String bankAccountNumberID, Double amount);
    Boolean withdraw(String bankAccountNumberID, Double amount);
}
public class AccountServiceImpl implements AccountService {
    
    @Override
    public Double getAccountBalance(String bankAccountNumberID){
        return 0.00;
    }
    
    @Override
    public Boolean deposit(String bankAccountNumberID, Double amount){
        return false;
    }
    
     @Override
    public Boolean withdraw(String bankAccountNumberID, Double amount){
        return false;
    }
}
