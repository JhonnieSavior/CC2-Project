package nestedif;

/**
 *
 * @author JUNIE_POGI CC2_1H-38
 */
import java.util.*;
import java.io.*;

public class NestedIf {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner aw = new Scanner(System.in);
        //BufferedReader zx = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("What is your course? \n"
                    + "[1] IT \n"
                    + "[2] CS \n"
                    + "[3] BSDA \n"
                    + "[4] Exit\n"
                    + "Enter choice: ");
            String course = aw.nextLine();
            if (course.equalsIgnoreCase("IT") || course.equals("1")) {
                System.out.print("What is your major? \n"
                        + "[1]Network and Security \n"
                        + "[2]Web Developing \n"
                        + "[3]Entertainment Resouce Plan \n"
                        + "Enter choice: ");
                String major = aw.nextLine();
                if (major.equalsIgnoreCase("Network and Security") || major.equals("1")) {
                    System.out.println("you are enrolled in IT major in Network and Security");
                } else if (major.equalsIgnoreCase("Web Developing") || major.equals("2")) {
                    System.out.println("you are enrolled in IT major in Web Developing");
                } else if (major.equalsIgnoreCase("Entertainment Resouce Plan") || major.equals("3")) {
                    System.out.println("you are enrolled in IT major in Entertainment Resouce Plan");
                } else {
                    System.out.println("invalid input");
                }

            } else if (course.equalsIgnoreCase("CS") || course.equals("2")) {
                System.out.print("What is your major? \n"
                        + "[1]Digital Arts and Aimation \n"
                        + "[2]Mobile Developing \n"
                        + "Enter choice: ");
                String major = aw.nextLine();
                if (major.equalsIgnoreCase("Digital Arts and Aimation") || major.equals("1")) {
                    System.out.println("you are enrolled in CS major in Digital Arts and Aimation");
                } else if (major.equalsIgnoreCase("Mobile Developing") || major.equals("2")) {
                    System.out.println("you are enrolled in CS major in Mobile Developing");
                } else {
                    System.out.println("invalid input");
                }
            } else if (course.equalsIgnoreCase("BSDA") || course.equals("3")) {
                System.out.println("you are enrolled in BSDA");
            } else if (course.equalsIgnoreCase("Exit") || course.equals("4")) {
                System.out.println("Good Bye! ");
                System.exit(0);
            } else {
                System.out.println("invalid input");
            }
        }
    }

}
