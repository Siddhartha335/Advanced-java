package exceptionPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

class Divison {
    public static int divide( int num, int den) {
        return num/den;
    }
}


public class ConceptOfException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d, n;
        boolean proceed = true;
       while (proceed) {
           try {
               System.out.println("Enter the numerator");
               n = scanner.nextInt();
               System.out.println("Enter the denominator");
               d = scanner.nextInt();
               int result = Divison.divide(n,d);
               System.out.println(result);
               proceed = false;
           }
           catch (InputMismatchException ex) {
               System.err.println("Exception is " + ex.getMessage());
               scanner.nextLine();
               System.out.println("Enter proper data!!");
           }
           catch (ArithmeticException ex) {
               System.err.println("Exception is " + ex);
               scanner.nextLine();
               System.out.println("Enter proper data!!");
           }
           finally {
               System.out.println("Congrats, Program runs!!");
           }
       }
    }

}
