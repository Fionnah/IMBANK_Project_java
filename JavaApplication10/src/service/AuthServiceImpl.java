/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Customer;
import repository.CustomerRepository;

/**
 *
 * @author Jasper
 */
interface AuthService{
    Boolean login(String username, String password);
    Boolean register(Customer customer);
}

public class AuthServiceImpl implements AuthService{

    private final CustomerRepository customerRepository;
    
    public AuthServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    
    @Override
    public Boolean login(String username, String password) {
        return false;
    }

    @Override
    public Boolean register(Customer customer) {
        return false;
    }
}
