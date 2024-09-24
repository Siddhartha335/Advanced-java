package inheritancePackage;
abstract class Animal {
    public void eat() {
        System.out.println("I eat food");
    }
}

class Tiger extends Animal {
    public void roar() {
        System.out.println("Roarrrrrrrrr");
    }
    @Override
    public void eat() {
        System.out.println("I eat fresh flesh");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Barkkkkkkk");
    }

    @Override
    public void eat() {
        System.out.println("I eat flesh and normal food!");
    }
}

public class HeirarchialInheritance {

    public static void main(String[] args) {
        Tiger t = new Tiger();
        Dog d = new Dog();
        t.eat();
        d.eat();
        t.roar();
        d.bark();
    }
}
