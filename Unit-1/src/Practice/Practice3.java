package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

//class Outer {
//    private int data = 40;
//
//    class Inner {
//        void access() {
//            System.out.println("The outer data is " + data);
//        }
//    }
//
//}

//abstract class Anonymous {
//
//    abstract public void display();
//}

//class LocalOuter {
//
//    void methodLocal() {
//        int data=40;
//
//        class LocalInner {
//            void display() {
//                System.out.println("Data is " + data);
//            }
//        }
//        LocalInner lin = new LocalInner();
//        lin.display();
//    }
//}

//class Outer {
//    static int data=40;
//    static class Inner {
//        void print() {
//            System.out.println(data);
//        }
//    }
//}
//class Area {
//    protected int length;
//    protected int breadth;
//
//    protected Area() {
//        this.length = this.breadth = 0;
//    }
//
//    protected Area(int length, int breadth) {
//        this.length = length;
//        this.breadth = breadth;
//    }
//
//    public String getArea() {
//        return String.format("The area is %d",length*breadth);
//    }
//}
//class Volume extends Area {
//    public int height;
//
//    public Volume() {
//        super();
//        this.height=0;
//    }
//
//    public Volume(int length, int breadth, int height) {
//        super(length,breadth);
//        this.height = height;
//    }
//
//    public String getVolume() {
//        return String.format("The volume is %d", length*breadth*height);
//    }
//}
//class Address {
//    String city,province,country;
//
//    public Address(String city, String province, String country) {
//        this.city = city;
//        this.country = country;
//        this.province = province;
//    }
//}
//
//class Employee {
//    Address address;
//    String name;
//
//    public Employee( String name, Address address) {
//        this.name = name;
//        this.address = address;
//    }
//
//    public String details() {
//        return String.format("The employee name is %s and their city name is %s, province is %s, and country is %s",name,address.city,address.province,address.country);
//    }
//
//}

//class Division {
//
//    public static int divide(int num, int den) {
//        return num/den;
//    }
//}

//class AgeException extends Exception {
//
//    public AgeException(String message) {
//        super(message);
//    }
//}
//class Good implements Runnable {
//    @Override
//    public void run() {
//        int i=0;
//        try {
//            while(i<5) {
//                System.out.println("Good");
//                Thread.sleep(1000);
//                i++;
//            }
//        }
//        catch (InterruptedException ex) {
//            System.err.println("Exception is: " + ex);
//        }
//    }
//}
//
//class Morning implements Runnable {
//    @Override
//    public void run() {
//        int i=0;
//        try {
//            while(i<5) {
//                System.out.println("Morning");
//                Thread.sleep(1000);
//                i++;
//            }
//        }
//        catch (InterruptedException ex) {
//            System.err.println("Exception is: " + ex);
//        }
//    }
//}
//class YieldMethod extends Thread {
//    @Override
//    public void run() {
//        int i=0;
//        Thread.yield();
//        while(i<5) {
//            System.out.println(currentThread().getName());
//            i++;
//        }
//    }
//}
//class BookSeat {
//    static int seats = 48;
//    public static synchronized void book(int req) {
//        if(req<=seats) {
//            System.out.println("Seats booked = " + req);
//            seats = seats - req;
//            System.out.println("Seats available = " + seats);
//        } else {
//            System.out.println(req + " seats not available");
//            System.out.println("Seats available = "+ seats);
//        }
//    }
//}

public class Practice3 {

//    public int getArea() {
//        return 0;
//    }
//
//    public int getArea(int length) {
//        return 4 * length;
//    }
//
//    public int getArea( int len, int bre) {
//        return len * bre;
//    }
//    public static void myAge(int age) throws AgeException {
//        if(age<0 || age==0) {
//            throw new AgeException("Age cant be zero or less than zero");
//        }
//        else {
//            System.out.println("Valid age");
//        }
//    }
//    static BookSeat csit;
//    int seats;
//
//    @Override
//    public void run() {
//        csit.book(seats);
//    }

    FileInputStream in = null;
    FileOutputStream out = null;

    public Practice3() throws IOException {
        in = new FileInputStream("/Users/siddharthraut/Desktop/College/7th-sem/Advanced-java/Unit-1/src/fileHandling/input.txt");
        out = new FileOutputStream("/Users/siddharthraut/Desktop/College/7th-sem/Advanced-java/Unit-1/src/Practice/output.txt");
        int ch;
        while((ch = in.read()) != -1) {
            out.write(ch);
        }
    }

    public static void main(String[] args) throws IOException {
//        int count, i=0;
//        String str;
//        count=args.length;
//        System.out.println("Number of arguments "+count);
//        while(i<count){
//            str=args[i];
//            i=i+1;
//            System.out.println(i + "Java is "+str+"!\n");
//        }
//        Scanner scanner  = new Scanner(System.in);
//        int[] arr = new int[5];
//        for(int i=0;i<arr.length;i++) {
//            System.out.println(String.format("Enter the  %dst element",i));
//            arr[i] = scanner.nextInt();
//        }
//        System.out.println("Printing an array:");
//        for(int i:arr) {
//            System.out.print(i + "\t");
//        }
        //array multiplication
//    int[][] arr1 = {{1,2},{3,4}};
//    int[][] arr2 = {{5,6},{7,8}};
//
//    int[][] arr3 = new int[2][2];
//
//    for(int i=0; i<arr1.length;i++) {
//        for(int j=0;j<arr2.length;j++) {
//            for(int k=0;k<arr3.length;k++) {
//                arr3[i][j] += arr1[i][k] * arr2[k][j];
//            }
//        }
//    }
//
//    for(int[] i:arr3) {
//        for(int j:i) {
//            System.out.print(j + "\t");
//        }
//        System.out.println();
//    }

//        Practice3 prac = new Practice3();
//        System.out.println(prac.getArea());
//        System.out.println(prac.getArea(5));
//        System.out.println(prac.getArea(6,5));

//        Practice3 out = new Practice3();
//        Practice3.Inner inner = out.new Inner();
//        inner.access();

//        Anonymous an = new Anonymous() {
//            @Override
//            public void display() {
//                System.out.println("I am a method of a anonymous class!");
//            }
//        };
//        an.display();
//        LocalOuter lot = new LocalOuter();
//        lot.methodLocal();
//        Outer.Inner inner = new Outer.Inner();
//        inner.print();

//        Volume v = new Volume();
//        System.out.println(v.getArea());
//        System.out.println(v.getVolume());;
//        Address addr = new Address("Patan","Bagmati","Nepal");
//        Employee emp = new Employee("Sid",addr);
//        System.out.println(emp.details());
//        Scanner sc = new Scanner(System.in);
//        boolean proceed = true;
//        while (proceed) {
//            try {
//                System.out.println("Enter numerator");
//                int n = sc.nextInt();
//                System.out.println("Enter denominator");
//                int d = sc.nextInt();
//                int res = Division.divide(n,d);
//                System.out.println(res);
//                proceed = false;
//            }
//            catch (InputMismatchException ex) {
//                System.err.println(String.format("Exception occurred, %s !",ex));
//                sc.nextLine();
//                System.out.println("Enter proper data!");
//            }
//            catch (ArithmeticException ex) {
//                System.err.println(String.format("Exception occurred, %s !",ex));
//                sc.nextLine();
//                System.out.println("Enter proper data!");
//            }
//            finally {
//                System.out.println("Finally, program runs!");
//            }
//        }
//        Scanner scanner = new Scanner(System.in);
//        boolean proceed = true;
//        while(proceed) {
//            System.out.println("Enter your age:");
//            int age = scanner.nextInt();
//            try {
//                myAge(age);
//                proceed = false;
//            }
//            catch (AgeException ex) {
//                System.err.println("Exception occurred, " + ex);
//            }
//        }
//        Good g = new Good();
//        Morning m = new Morning();
//        Thread t1 = new Thread(g);
//        Thread t2 = new Thread(m);
//        t1.start();
//        t2.start();
//        YieldMethod y = new YieldMethod();
//        y.start();
////        Thread.yield();
//        int i=0;
//        while(i<5) {
//            System.out.println(currentThread().getName());
//            i++;
//        }
//        csit = new BookSeat();
//        Practice3 p1 = new Practice3();
//        p1.seats = 24;
//        p1.start();
//        Practice3 p2 = new Practice3();
//        p2.seats = 34;
//        p2.start();

        new Practice3();

    }
}
