package packageOne;

public class SamePackageNonSubClass {
        ProtectionLevel pl;

    public static void main(String[] args) {
        pl = new ProtectionLevel();
        System.out.println("Default num "+ pl.num);
        System.out.println("Private num "+ pl.numpri);
        System.out.println("Protected num "+ pl.numpro);
        System.out.println("Public num "+ pl.numpub);
    }
}

//In same package non sub class: private data are not accessed