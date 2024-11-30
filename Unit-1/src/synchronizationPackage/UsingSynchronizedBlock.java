package synchronizationPackage;

class CSITSeats {
    int totalSeats = 48;
    public void book(int reqseats) {
        synchronized(this) { //this indicates the reference to the class
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
}

public class UsingSynchronizedBlock extends Thread {
    static CSITSeats csit;
    int seats;
    @Override
    public void run() {
        csit.book(seats);
    }

    public static void main(String[] args) {
        csit = new CSITSeats();
        UsingSynchronizedBlock sid = new UsingSynchronizedBlock();
        sid.seats = 24;
        sid.start();
        UsingSynchronizedBlock sid1 = new UsingSynchronizedBlock();
        sid1.seats = 24;
        sid1.start();
    }
}
