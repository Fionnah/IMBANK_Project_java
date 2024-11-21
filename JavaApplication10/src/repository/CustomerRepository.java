/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import model.Customer;
/**
 *
 * @author Jasper
 */
public class CustomerRepository {
    
    public Boolean saveCustomer(Customer customer){
        return true;
    }
    
    public Customer findCustomerByUsername(String username){
        Customer customer = new Customer();
        return customer;
    }
    
    public Customer findCustomerByID(String customerID){
        Customer customer = new Customer();
        return customer;
    }
}

