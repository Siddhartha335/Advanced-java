package interfacePackage;

interface Student {

    void method1(); // by default public abstract
    public abstract void method2();
    int a=20; //Final value must be initialized (public,static,final )
}

interface College extends Student {

}

class Admin {

}

//Class extends Class , Class implements interface, Interface extends Interface
public class InterfaceDemonstration extends Admin implements Student,College {

    public static void main(String[] args) {
        System.out.println("a:"+a);
    }

    @Override
    public void method1() {
        System.out.println("This is an inherited interface methods");
    }

    @Override
    public void method2() {

    }
}