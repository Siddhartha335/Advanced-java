package packageTwo;
import packageOne.ProtectionLevel;
public class DifferentPackageNonSubClass {

    public DifferentPackageNonSubClass() {
        ProtectionLevel pl = new ProtectionLevel();
//        System.out.println("Default num "+ pl.num);
//        System.out.println("Private num "+ pl.numpri);
//        System.out.println("Protected num "+ pl.numpro);
        System.out.println("Public num "+ pl.numpub);
    }

}

//In different package non subclass: default, protected and private data are ont accessed
