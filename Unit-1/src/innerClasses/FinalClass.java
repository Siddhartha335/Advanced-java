package innerClasses;

class A {
    static final int a;

//    A() {
//        a = 20;
//    }

    static {
        a=30;
    }
}

class B extends A {
    void display() {

    }
}

//1.final class can not be inherited or subclassed
//2.final method can not be overridden
//3.final value must be initialized at the time of declaration
//4.final values can be initialized with constructor or within a static block
public class FinalClass {

    public static void main(String[] args) {

    }

}
