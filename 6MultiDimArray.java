package multidimarray;

import java.util.*;

/**
 *
 * @author CC2_1H-38
 */
public class MultiDimArray {

    public static void main(String[] args) {
        /*String [][] names= {{"Teofilo","Ana"},{"Adrian","Alduin"},{"Fred","John"},{"Emil","David"}};
        for(int i = 0; i < names.length; i++){
            System.out.print("row "+i+" ");
            for (int j = 0; j < names.length; j++) {
                System.out.print(names[i][j]+" ");
            }
        }
        String [][] a = {
            {"1", "2", "3"},
            {"-4", "-5", "6", "9"},
            {"7"},};

        for (int i = 0; i < a.length; ++i) {
            System.out.print("row "+i+" ");
            for (int j = 0; j < a[i].length; ++j) {
                System.out.println(a[i][j]);
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("length for every column: ");
        int lengths = sc.nextInt();
        System.out.println("what do you want to do? "
                + "[1]next row"
                + "[2]done");
        int choi= sc.nextInt();
        if(choi==1){
            
        }*/
        Scanner sc = new Scanner(System.in);
        int rows;
        int columns;
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        columns = sc.nextInt();
        String [][] matrix = new String[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the number for row " + i + " and column " + j + " : ");
                matrix[i][j] = sc.next();
            }
        }
        System.out.print("column : ");
        for (int j = 0; j < columns; j++) {
            System.out.print("" + j + "\t");
        }
        for (int i = 0; i < matrix.length; ++i) {
            System.out.print("\n row "+i+" : ");
            for (int j = 0; j < matrix[i].length; ++j) {
                System.out.print(matrix[i][j]+"\t");
            }
        }
        
    }

}
