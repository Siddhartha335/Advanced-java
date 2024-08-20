package synchronizationPackage;

class CSITBookStatic {
    static int totalSeats = 48;
    public static synchronized void book(int reqseats) {
        if(reqseats<=totalSeats) {
            System.out.println("Seats booked = " + reqseats);
            totalSeats = totalSeats - reqseats;
            System.out.println("Seats available = " + totalSeats);
        }
        else {
            System.out.println(reqseats + " seats not available");
            System.out.println("Seats available = "+ totalSeats);
        }
    }
}

public class UsingStaticMethod extends Thread {
    static CSITBookStatic csit;
    int seats;
    @Override
    public void run() {
        csit.book(seats);
    }

    public static void main(String[] args) {
        csit = new CSITBookStatic();
        UsingStaticMethod sid = new UsingStaticMethod();
        sid.seats = 24;
        sid.start();
        UsingStaticMethod sid1 = new UsingStaticMethod();
        sid1.seats = 24;
        sid1.start();
    }
}