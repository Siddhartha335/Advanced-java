package packageOne;

public class SamePackageSubClass  extends ProtectionLevel{

    public static void main(String[] args) {
        ProtectionLevel pl = new ProtectionLevel();
        System.out.println("Default num "+ pl.num);
//        System.out.println("Private num "+ pl.numpri);
        System.out.println("Protected num "+ pl.numpro);
        System.out.println("Public num "+ pl.numpub);
    }
}

//In same package subclass: private data are not acessed