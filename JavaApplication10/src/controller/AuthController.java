/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

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
    
    public Boolean handleLogin(){
        return false;
    }
    
    public Boolean handleRegistration(){
        return false;
    }
}
