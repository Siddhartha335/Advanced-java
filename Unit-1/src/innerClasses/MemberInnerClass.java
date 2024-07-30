package innerClasses;

class Outer {
    private int data=40;
    class Inner { //member class of outer class
        void access() {
            System.out.println("The data of the outer class is:"+data);
        }
    }
}
public class MemberInnerClass {

    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner inner = out.new Inner();
        inner.access();
    }

}
