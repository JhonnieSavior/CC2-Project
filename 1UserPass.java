/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userpass;

import java.util.Scanner;

/**
 *
 * @author CC2_1H-38
 */
public class UserPass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
       Scanner sc = new Scanner(System.in);
       
        System.out.print("Username: ");
        String user = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();
        System.out.print("Verify Password: ");
        String verify = sc.nextLine();
        
        if(pass.equals(verify)){
            System.out.println("Correct Password!");
        }
        else{
            System.out.println("Invalid Output!");
        }
        
    
    }
    
}
