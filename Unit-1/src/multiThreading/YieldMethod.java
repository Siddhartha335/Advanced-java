package multiThreading;

public class YieldMethod extends Thread{

    @Override
    public void run() {
        int i=0;
        Thread.yield();
        while(i<5) {
            System.out.println(currentThread().getName());
            i++;
        }
    }

    public static void main(String[] args) {

        YieldMethod y1 = new YieldMethod();
        y1.start();
        Thread.yield();
        int i=0;
        while(i<5) {
            System.out.println(currentThread().getName());
            i++;
        }

    }

}
