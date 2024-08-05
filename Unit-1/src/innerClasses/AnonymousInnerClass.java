package innerClasses;

abstract class Anonymous {
    public abstract void display(); //signature
}

public class AnonymousInnerClass {

    public static void main(String[] args) {
        Anonymous an = new Anonymous() {
            @Override
            public void display() {
                System.out.println("I am method of anonymous class");
            }
        };
        an.display();
    }

}
