/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Date;
import model.AffiliatedBanks;
import model.BankAccount;
import model.CardInfo;
import model.Customer;
import model.Person;
import service.AuthServiceImpl;

/**
 *
 * @author Jasper
 */
public class AuthController {
    
    private final AuthServiceImpl authService;
    
    public AuthController(AuthServiceImpl authService){
        this.authService = authService;
    }
    
    public Boolean handleLogin(String username, String password){
        return authService.login(username, password);
    }
    
    public Boolean handleRegistration(Customer customer){
        return authService.register(customer);
    }
    
//    public void getData(String[] dataArray){
//        Person person=new Person();
//        person.setFirstName(dataArray[0]);
//        person.setLastName(dataArray[1]);
//        person.setAge(Integer.parseInt(dataArray[2]));
//        person.setBirthdate(Long.parseLong(dataArray[3]));
//        person.setSex(dataArray[4]);
//        person.setPhoneNum(dataArray[5]);
//        
//        Customer customer=new Customer();
//        
//        BankAccount bankAccount=new BankAccount();
//        
//        CardInfo cardInfo=new CardInfo();
//   
//        AffiliatedBanks affiliatedBanks=new AffiliatedBanks();
//        
//      
//        
//    }
}
