public class OOPConcept {
    int a; //instance (non-static) variable

    static int b;

    static void Test() {
        System.out.println("Testing...");
    }
    void display() { // member-function with bind object
        System.out.println(a);
    }

    public static void main(String[] args) {
        OOPConcept obj = new OOPConcept();
        obj.a= 20;
        System.out.println(obj.a);
        obj.display();
        Test(); //static -> no objects are required to access
    }
}
