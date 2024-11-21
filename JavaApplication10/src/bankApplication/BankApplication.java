/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankApplication;

import controller.AccountController;
import controller.AuthController;
import controller.TransactionController;
import java.awt.EventQueue;
import repository.BankAccountRepository;
import repository.CustomerRepository;
import repository.TransactionRepository;
import service.AccountServiceImpl;
import service.AuthServiceImpl;
import service.TransactionServiceImpl;
import view.LogInWindow;
/**
 *
 * @author Admin
 */
public class BankApplication {

    private static CustomerRepository customerRepository;
    private static AuthServiceImpl authService;
    private static AuthController authController;
    
    private static  BankAccountRepository bankAccountRepository;
    private static AccountServiceImpl accountServiceImpl;
    private static AccountController accountController;
    
    private static TransactionRepository transactionRepository;
    private static TransactionServiceImpl transactionServiceImpl;
    private static TransactionController transactionController;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        customerRepository = new CustomerRepository();
        authService = new AuthServiceImpl(customerRepository);
        authController = new AuthController(authService);
        
        bankAccountRepository = new BankAccountRepository();
        accountServiceImpl = new AccountServiceImpl(bankAccountRepository);
        accountController = new AccountController(accountServiceImpl);
        
        transactionRepository = new TransactionRepository();
        transactionServiceImpl = new TransactionServiceImpl(transactionRepository);
        transactionController = new TransactionController(transactionServiceImpl);
        
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                LogInWindow logIn = new LogInWindow(accountController, authController, transactionController);
                logIn.pack();
                logIn.setVisible(true);
            }
        });
    }
}
