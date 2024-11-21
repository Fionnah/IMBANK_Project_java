/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Customer;
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
}
