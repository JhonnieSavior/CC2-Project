package fibonacci;

import java.util.*;

/**
 *
 * @author Black
 */
public class Fibonacci {

    public static int xx;

    public static void main(String[] args) {
        user();
        display();
    }

    public static void user() {
        Scanner sc = new Scanner(System.in);
        System.out.print("fibonacci of : ");
        xx = sc.nextInt();

    }

    public static int fibo(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else {
            return fibo(x - 1) + fibo(x - 2);
        }
    }

    public static void display() {
        for (int i = 0; i <= xx; i++) {
            System.out.print("f(" + i + ")\t");
        }
        for (int i = 0; i <= xx; i++ ){
            System.out.println("");
            for (int p = 0; p <= i; p++){
                System.out.print("" + fibo(p) + "\t");
            }
            
        }
    }

}
