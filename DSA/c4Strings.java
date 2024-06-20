import java.util.Scanner;

public class C4Strings {
    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");
        System.out.println(str + str2);
        Scanner sc = new Scanner(System.in);
        String name;
        // name = sc.next();
        name = sc.nextLine();
        System.out.println(name);
        sc.close();

        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());

        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
    }
}
