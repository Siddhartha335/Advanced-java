package multiThreading;

class Good extends Thread{
    @Override
    public void run() {
        int i=0;
        try {
            while(i<10) {
                System.out.println("Good");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException ex) {
            System.out.println("The exception:" + ex);
        }
    }
}

class Morning extends Thread {
    @Override
    public void run() {
        int i=0;
        try {
            while(i<10) {
                System.out.println("Morning!");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException ex) {
            System.out.println("The exception:" + ex);
        }
    }
}

public class MultiThreadingConcept {
    public static void main(String[] args) {
        Good g= new Good(); //object of thread
        Morning m= new Morning(); //object of thread
        g.start();
        m.start();
//        Thread scheduler is responsible for executing the threads
    }
}
