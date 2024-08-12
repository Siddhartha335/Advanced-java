package exceptionPackage;

import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class CustomException {

    public static void myAge(int age) throws AgeException {
        if (age < 0) {
            throw new AgeException("Age less than zero not accepted");
        } else {
            System.out.println("Valid Age");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        boolean proceed = true;
        while (proceed)
        {
            System.out.println("Enter your age:");
            age = scanner.nextInt();
            try {
                myAge(age);
                proceed = false;
            } catch (AgeException ex) {
                System.err.println("Exception," + ex);
            } finally {
                System.out.println("Program is running successfully");
            }
        }
    }
}
