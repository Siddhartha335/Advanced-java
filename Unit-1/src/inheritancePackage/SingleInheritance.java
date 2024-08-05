package inheritancePackage;
class Room {
    int length,breadth;

    public Room() {
        this.length = this.breadth = 0;
    }

    public Room( int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return length*breadth;
    }
}

class BedRoom extends Room { //Single Inheritance
    int height;

    public BedRoom() {
        this.height = 0;
    }

    public BedRoom(int length, int breadth,int height) {
        super(length,breadth); //passes to base constructor
        this.height = height;
    }

    int volume() {
        return length*breadth*height;
    }
}

public class SingleInheritance {

    public static void main(String[] args) {
        BedRoom br = new BedRoom(5,6,7);
        System.out.println("Area of a bedroom is "+br.area());
        System.out.println("Volume of a bedroom is "+br.volume());
    }
}
