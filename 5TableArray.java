package tablearray;
import java.util.*;
/**
 *
 * @author Black
 */
public class TableArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements you want to enter ? ");
        int user = sc.nextInt();
        int num[] = new int[user];
        int ucount = 0;
        for (int i = 0; i < user; i++) {
            System.out.print("Enter your Elements for index "+i+" :");
            int u = sc.nextInt();
            num[ucount]= u;
            ucount++;
        }
        
        System.out.print("Elements: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print( num[i]+" ");
        }
        
        System.out.println("");
        System.out.println("\f\f\fTABLE\f\f\f");
        System.out.println("EVEN\tODD");
        //ArrayList<Integer> even = new ArrayList<>();
        //ArrayList<Integer> odd = new ArrayList<>();
        int e[] = new int[num.length];
        int o[] = new int[num.length];
        int ecount = 0;
        int ocount = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                //even.add(num[i]);
                e[ecount] = num[i];
                ecount++;
            }

            if ((num[i] % 2) != 0) {
                //odd.add(num[i]);
               o[ocount] = num[i];
               ocount++;
            } else {
            }
        }
        
        for (int i = 0; i < ecount || i < ocount; i++) {
            //System.out.println(even.get(i)+"\t"+odd.get(i));
            if(e[i]!= 0 && o[i]!=0 ){
            System.out.println(e[i] + "\t" + o[i]);
            }else if (e[i]!= 0 && o[i] == 0){
                System.out.println(e[i] + "\t" );
            }else if (e[i]== 0 && o[i] != 0){
                System.out.println( " \t" +o[i]);
            }
        }

    }

}
