/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankApplication;

import java.awt.EventQueue;
import view.LogInWindow;
/**
 *
 * @author Admin
 */
public class BankApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(LogInWindow::new);
    }
}
