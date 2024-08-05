package inheritancePackage;

abstract class Car {
    final int wheels = 4;
    public Car() {
        System.out.println("This is car constructor!");
    }

    public void vechicleType() {
        System.out.println("Type: Car");
    }

}

abstract class Honda extends Car{

    public Honda() {
        System.out.println("This is a Honda constructor!");
    }

    public void Brand() {
        System.out.println("Brand: Honda");
    }

    public void Speed() {
        System.out.println("Capacity: 100 km/hr");
    }
}

class HondaCivic extends Honda{

    public HondaCivic() {
        System.out.println("This is a HondaCivic Constructor!");
    }

    @Override  //data-annotation
    public void Speed() { //Method overridden
        System.out.println("Capacity: 120 km/hr");

    }

}

public class MultilevelInheritance {
    public static void main(String[] args) {
        HondaCivic civic = new HondaCivic();
        System.out.println("Final Wheels: "+ civic.wheels);
        civic.vechicleType();
        civic.Brand();
        civic.Speed();
    }
}
