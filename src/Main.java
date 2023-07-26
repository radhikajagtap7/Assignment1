// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("College ="+Student.getCollege());

        Student s1 = new Student("Radhika","TyBcs");
        Student s2 = new Student("Vasanti","SyBcs");
        Student s3 = new Student("Gopika","FyBcs");
        Student s4 = new Student("Urvi","FyBcs");

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}