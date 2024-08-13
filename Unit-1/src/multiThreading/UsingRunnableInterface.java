package multiThreading;

class Good1 implements Runnable{
    @Override
    public void run() {
        int i=0;
        try {
            while(i<10) {
                System.out.println("Good");
                Thread.sleep(1000);
                i++;
            }
        }
        catch (InterruptedException ex) {
            System.out.println("The exception:" + ex);
        }
    }
}

class Morning1 implements Runnable {
    @Override
    public void run() {
        int i=0;
        try {
            while(i<10) {
                System.out.println("Morning!");
                Thread.sleep(1000);
                i++;
            }
        }
        catch (InterruptedException ex) {
            System.out.println("The exception:" + ex);
        }
    }
}
public class UsingRunnableInterface {
    public static void main(String[] args) {
        Good1 g1 = new Good1();
        Morning1 m1 = new Morning1();
        Thread t1 = new Thread(g1);
        Thread t2 = new Thread(m1);
        t1.start();
        t2.start();
    }
}
