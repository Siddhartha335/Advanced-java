package synchronizationPackage;

class CSITBook {
    int totalSeats = 48;
    public void book(int reqseats) {
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

public class WithoutSynchronization extends Thread {
    static CSITBook csit;
    int seats;
    @Override
    public void run() {
        csit.book(seats);
    }

    public static void main(String[] args) {
        csit = new CSITBook();
        WithoutSynchronization sid = new WithoutSynchronization();
        sid.seats = 24;
        sid.start();
        WithoutSynchronization sid1 = new WithoutSynchronization();
        sid1.seats = 40;
        sid1.start();
    }
}
