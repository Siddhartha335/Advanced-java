package packageTwo;

import packageOne.ProtectionLevel; //user-defined import

public class DifferentPackageSubClass extends ProtectionLevel {

    public DifferentPackageSubClass() {
//        System.out.println("Default num "+ num);
//        System.out.println("Private num "+ numpri);
        System.out.println("Protected num "+ numpro);
        System.out.println("Public num "+ numpub);
    }

}

//In different package sub class: default and private are ont accessed