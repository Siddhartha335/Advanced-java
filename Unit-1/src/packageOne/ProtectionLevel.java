package packageOne;

public class ProtectionLevel {
    int num = 2;
    private int numpri = 7;
    protected  int numpro = 13;

    public int numpub = 17;
    public ProtectionLevel() {
        System.out.println("Default num "+ num);
        System.out.println("Private num "+ numpri);
        System.out.println("Protected num "+ numpro);
        System.out.println("Public num "+ numpub);

    }

    //Same package, same class all types data are acessed

//    public static void main(String[] args) {
//
//    }
}


//Packages:
//1.User defined package
//2. system define package: java.util, javax.swing, java.io, java.sql etc