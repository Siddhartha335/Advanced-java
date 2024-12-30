package inheritancePackage;

class Address {
    String province,city,country;

    public Address(String province,String city, String country) {
        this.province = province;
        this.city = city;
        this.country = country;
    }
}

class Employee {
    Address address;
    String name;
    int id;

    public Employee(String name,int id,Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String displayInfo() {
        return String.format("The student %s of id %d is from city %s province and %s country",name,id, address.city, address.province);
    }

}

//class Student {
//
//}

public class Aggregation { //Aggregation hava a has-a relationship

    public static void main(String[] args) {
        Address address = new Address("Bagmati","Lalitpur","Nepal");
        Employee emp = new Employee("Siddhartha",1,address);
        System.out.println(emp.displayInfo());

    }
}
