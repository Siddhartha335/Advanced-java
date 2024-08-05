package innerClasses;

class LocalOuter {
    void methodlocal() {
        int data=100;
        class LocalInner {
            void  print() {
                System.out.println("Data is:" + data);
            }
        }
        LocalInner linner = new LocalInner();
        linner.print();

    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        LocalOuter lout = new LocalOuter();
        lout.methodlocal();
    }
}
