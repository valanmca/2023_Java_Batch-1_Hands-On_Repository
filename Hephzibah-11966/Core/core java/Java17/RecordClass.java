package Java17;

record Person(int Empid, String Empname) { }

public class RecordClass {
    public static void main(String[] args) {

        Person p1 = new Person(21, "Hephzibah");
        System.out.println("Age :" + p1.Empid());
        System.out.println("Name :" + p1.Empname());
        System.out.println(p1.toString());
        System.out.println("Hashcode for FirstObject :" + p1.hashCode());

        Person p2 = new Person(16, "Sheebah");
        System.out.println("ID :" + p2.Empid());
        System.out.println("Name :" + p2.Empname());
        System.out.println(p2.toString());
        System.out.println("Hashcode for SecondObject :" + p2.hashCode());
        System.out.println("p1,p2 is Equal :" + p1.equals(p2));
    } }
