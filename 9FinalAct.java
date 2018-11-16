/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalact;

import java.io.*;

/**
 *
 * @author CC2_1H-38
 */
public class FinalAct {

    public static BufferedReader br;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        choosing();
    }
    public static void choosing() throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What TO DO ?\n"
                + "\t(*)Factorial\n"
                + "\t(*)Fibonacci\n");
        while (true) {
            System.out.print("Enter choice: ");
            String cho = br.readLine();
            if (cho.equalsIgnoreCase("Factorial")) {
                factorial();
            } else if (cho.equalsIgnoreCase("Fibonacci")) {
                fibonacci();
            } else {
                System.out.println("Invalid Input");
            }
        }
    }
    
    public static void fibonacci() throws IOException {
        System.out.print("How many elements you want to enter ? ");
        int user = Integer.parseInt(br.readLine());
        int num[] = new int[user];
        int ucount = 0;
        for (int i = 0; i < user; i++) {
            System.out.print("Enter Element for index " + i + " :");
            int u = Integer.parseInt(br.readLine());
            num[ucount] = u;
            ucount++;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print("f(" + num[i] + ")\t");
        }
        System.out.println("");
        for (int i = 0; i < num.length; i++) {
            System.out.print("" + fibo(num[i]) + "\t");
        }
        System.exit(0);
    }

    public static int fibo(int x) {
        if (x <= 1) {
            return x;
        } else {
            return fibo(x - 1) + fibo(x - 2);
        }
    }

    public static void factorial() throws IOException {
        System.out.print("How many elements you want to enter ? ");
        int facUser = Integer.parseInt(br.readLine());
        int num[] = new int[facUser];
        int ucount = 0;
        for (int i = 0; i < facUser; i++) {
            System.out.print("Enter Element for index " + i + " :");
            int u = Integer.parseInt(br.readLine());
            num[ucount] = u;
            ucount++;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print("f(" + num[i] + ")\t");
        }
        System.out.println("");
        for (int i = 0; i < num.length; i++) {
            System.out.print("" + fact(num[i]) + "\t");
        }
        System.exit(0);
    }

    static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * fact(n - 1));
        }
    }
}
