public class WhyConstructor {

    int length,breadth;

    WhyConstructor(int length,int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("The area of rectangle is:"+length*breadth);
    }

    WhyConstructor(int length)
    {
        this.length = length;
        System.out.println("The area of square is:"+4*3.14*length*length);
    }
    public static void main(String[] args) {

        WhyConstructor square = new WhyConstructor(5);
        WhyConstructor rectangle = new WhyConstructor(5,10);

    }
}
