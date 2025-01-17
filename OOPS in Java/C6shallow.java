public class C6shallow {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Dk";
        s1.rollno = 10;
        s1.password = "abc123";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.marks[2] = 85;
        s2.password = "xyz";

        for (int i = 0; i < s1.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int rollno;
    String password;
    int marks[];

    // shallow Copy constructor
    // Student(Student s1) {
    // this.marks = new int[3];
    // this.name = s1.name;
    // this.rollno = s1.rollno;
    // this.password = s1.password;
    // }

    // deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        this.password = s1.password;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
         System.out.println("Constructor is called...");   
    }  
}
