public class C6Const {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Dev";
        Student s2 = new Student("DK");
        Student s3 = new Student("Raj", 1);
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name + " " + s3.rollno);
    }
}
class Student {
    String name;
    int rollno;

    // Non-Parameterized constructor
    Student() {

    }
    // Parameterized constructor
    Student(String name) {
        this.name = name;
    }

    // Parameterized constructor
    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
}
