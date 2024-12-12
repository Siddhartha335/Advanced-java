package Practice;

import java.util.Scanner;

//class AgeException extends Exception {
//    public AgeException(String message) {
//        super(message);
//    }
//}

class CSITBatch {
    int seats=48;
    public void book(int req) {
        synchronized (this) {
            if (req <= seats) {
                System.out.println("Seats booked = " + req);
                seats = seats - req;
                System.out.println("Seats available = " + seats);
            } else {
                System.out.println(req + " seats not available");
                System.out.println("Seats available = " + seats);

            }
        }
    }
}


public class Practice2 extends Thread {

//    int length;
//    Practice2(int length) {
//        this.length = length;
//    }

//    public void display() {
//        System.out.println(length);
//    }

//    static void swap(int[] arr,int a, int b) {
//        int temp;
//        temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }

//    public static void myAge(int age) throws AgeException {
//        if(age < 0 || age==0) {
//            throw new AgeException("Age cant be zero and lesser than zero!");
//        } else {
//            System.out.println("Valid age!");
//        }
//    }
    static CSITBatch csit;
    int seats;

    @Override
    public void run() {
        csit.book(seats);
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num = sc.nextInt();
//        System.out.println("num = " + num);

//        int[] a = new int[5];
//        for( int i=0; i<a.length;i++) {
//            System.out.println(String.format("Enter the %d number in array:",i));
//            a[i] = sc.nextInt();
//        }
//        System.out.println("Printing an array");
//        for(int x:a) {
//            System.out.print(x + "\t");
//        }

//        int[] arr = {12,234,1,4,7};
//        for(int b:arr) {
//            System.out.print(b + "\t");
//        }
//        System.out.println();
//
//        for(int i=0;i<arr.length-1;i++) {
//            for(int j=i+1;j<arr.length;j++) {
//                if(arr[i]>arr[j]) {
//                    swap(arr,i,j);
//                }
//            }
//        }
//            System.out.println("After sorting,printing an array: ");
//        for(int b:arr) {
//            System.out.print(b + "\t");
//        }

//        int[][] array1 = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] array2 = {{11,12,13},{14,15,16},{17,18,19}};
//
//        System.out.println("Printing an array:");
//
//        for(int[] x: array1) {
//            for(int y: x) {
//                System.out.print(y + "\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        for(int[] x: array2) {
//            for(int y: x) {
//                System.out.print(y + "\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println("Multiplying an array: ");
//        int[][] array3 = new int [3][3];
//
//        for(int i=0;i<3;i++) {
//            for(int j=0;j<3;j++) {
//                for(int k=0;k<3;k++) {
//                    array3[i][j] += array1[i][k] * array2[k][j];
//                }
//            }
//        }
//
//        for(int[] x: array3) {
//            for(int y: x) {
//                System.out.print(y + "\t");
//            }
//            System.out.println();
//        }

//        Practice2 pr = new Practice2();
//        pr.length = 6;
//        pr.display();
//        int age = sc.nextInt();
//        System.out.println(age);
//        try {
//            myAge(age);
//        }
//        catch (AgeException ex) {
//            System.err.println("Exception," + ex);
//        }
        csit = new CSITBatch();
        Practice2 p1 = new Practice2();
        p1.seats = 24;
        p1.start();
        Practice2 p2 = new Practice2();
        p2.seats = 25;
        p2.start();


    }
}
