package Java17;

interface Printable {
    void print();
}
record Emp(String name, int id) implements Printable {
    public void print() {
        System.out.println("Name: " + name + ", EmpID: " + id);
    }
}
public class RecordInterface {
    public static void main(String[] args) {
        Emp person1 = new Emp("suve", 11956);
        person1.print();
        Emp person2 = new Emp("mat", 11961);
        person2.print();
    }
}
