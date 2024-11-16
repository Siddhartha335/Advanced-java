package synchronizationPackage;

class CSITBook1 {
    int totalSeats = 48;
    public synchronized void book(int reqseats) {
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

public class UsingSynchronizedMethod extends Thread {
    static CSITBook1 csit;
    int seats;
    @Override
    public void run() {
        csit.book(seats);
    }

    public static void main(String[] args) {
        csit = new CSITBook1();
        UsingSynchronizedMethod sid = new UsingSynchronizedMethod();
        sid.seats = 24;
        sid.start();
        UsingSynchronizedMethod sid1 = new UsingSynchronizedMethod();
        sid1.seats = 25;
        sid1.start();
    }
}