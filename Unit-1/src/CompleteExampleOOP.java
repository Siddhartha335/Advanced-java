import java.util.Scanner;

public class CompleteExampleOOP {
    int num; //instance variable

    int setVariable(int num) { //return type method
        return this.num = num;
    }

    int fibonacci(int n) {
        if(n==0) {
            return  0;
        }
        if(n==1 ||n==2) {
            return  1;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    int factorial(int n) {
        if(n==0) {
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) { //main method
        CompleteExampleOOP oop = new CompleteExampleOOP();
        oop.setVariable(5); //function call
        System.out.println(oop.num);
        System.out.println("Enter the term upto,you want to find fibonacci series");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("The fibonacci series is:");
        for(int i=0;i<n;i++) {
            int result = oop.fibonacci(i);
            System.out.print(result + " ");
        }
        System.out.println();
        int factorialResult = oop.factorial(n);
        System.out.println(String.format("The factorial is %d",factorialResult));
    }
}
