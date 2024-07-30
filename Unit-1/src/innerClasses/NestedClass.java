package innerClasses;

class Outer1 {
    private static int data=40;
    static class Inner1 { //member class of outer class
        void access() {
            System.out.println("The data of the outer class is:"+data);
        }
    }
}
public class NestedClass {

    public static void main(String[] args) {
//        Outer1 out = new Outer1();
        Outer1.Inner1 inner = new Outer1.Inner1();
        inner.access();
    }

}
