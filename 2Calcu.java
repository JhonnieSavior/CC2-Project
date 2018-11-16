/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu;

import java.io.*;

public class Calcu {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("******CALCU******");
        System.out.print("enter first number: ");
        double fnum = Double.parseDouble(br.readLine());
        System.out.print("enter second number: ");
        double snum = Double.parseDouble(br.readLine());
        
        System.out.print("choose an Operator\n"
                + "a. Addition or +\n"
                + "b. Subtraction or -\n"
                + "c. Division or /\n"
                + "d. Multiplication or *\n"
                + "e. Modulo or %\n"
                + "Enter choice: ");
        
        String cho = br.readLine();
         if(cho.equals("a")||cho.equals("+")){
            System.out.println("answer: "+ (fnum+snum));
        }else if (cho.equals("b")||cho.equals("-")){
            System.out.println("answer: "+ (fnum-snum));
        }else if (cho.equals("c")||cho.equals("/")){
            System.out.println("answer: "+ (fnum/snum));
        }else if (cho.equals("d")||cho.equals("*")){
            System.out.println("answer: "+ (fnum*snum));
        }else if (cho.equals("e")||cho.equals("%")){
            System.out.println("answer: "+ (fnum%snum));
        }else{
            System.out.println("invalid input");
        }
        
    }
    
}