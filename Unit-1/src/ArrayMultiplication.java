import java.text.MessageFormat;
import java.util.Scanner;

public class ArrayMultiplication {

    public static void main(String[] args) {
        System.out.println("Let's multiply two arrays:");
        System.out.println("Enter the array1 dimension(row):");
        Scanner input1 = new Scanner(System.in);
        int n1 = input1.nextInt();
        System.out.println("Enter the array1 dimension(column):");
        Scanner input2 = new Scanner(System.in);
        int n2 = input2.nextInt();
        int [][] array1= new int[n1][n2];

        for(int i=0;i<n1;i++) {
            for(int j=0;j<n2;j++) {
                System.out.println(String.format("Enter the number at array1[%d][%d]:",i,j));
                array1[i][j] = input1.nextInt();
                System.out.println();

            }
        }

        System.out.println("Array 1st  data is:");
        for (int i=0;i<n1;i++) {
            for(int j=0;j<n2;j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the array2 dimension(row):");
        Scanner input3 = new Scanner(System.in);
        int n3 = input3.nextInt();
        System.out.println("Enter the array2 dimension(column):");
        Scanner input4 = new Scanner(System.in);
        int n4 = input4.nextInt();
        int [][] array2= new int[n3][n4];

        for(int i=0;i<n3;i++) {
            for(int j=0;j<n4;j++) {
                System.out.println(String.format("Enter the number at array2[%d][%d]:",i,j));
                array2[i][j] = input3.nextInt();
                System.out.println();

            }
        }

        System.out.println("Array 2nd data is:");
        for (int i=0;i<n3;i++) {
            for(int j=0;j<n4;j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

//        Checking for multiplication
        if (n1 != n3) {
            System.out.println("\nMultiplication Not Possible");
        }

//        Multiplying two arrays
        int [][] array3 = new int[n1][n4];
        for(int i=0;i<n1;i++) {
            for(int j=0;j<n4;j++) {
                for(int k=0;k<n3;k++) {
                    array3[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }

        System.out.println("Multiplication is:");
        for (int i=0;i<n1;i++) {
            for(int j=0;j<n3;j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
