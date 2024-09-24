public class Fibonaaci {

    public static int fibonaaciSeries(int n) {
        if(n==0) {
            return  0;
        }
        if(n==1 ||n==2) {
            return  1;
        }
        else {
            return fibonaaciSeries(n-1) + fibonaaciSeries(n-2);
        }
    }

    public static void main(String[] args) {
        Fibonaaci fib = new Fibonaaci();
        System.out.println("The fibonacci series is:");
        for(int i=0;i<6;i++) {
            int result = fib.fibonaaciSeries(i);
            System.out.print(result + " ");
        }
    }
}

