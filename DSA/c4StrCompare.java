package DSA;

public class c4StrCompare {
    public static void main(String[] args) {
        String str = "Tony";
        String str1 = "Tony";
        String str2 = new String("Tony");

        // Compare str == str1
        if (str == str1) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("nStrings are not equal");
        }

        // Compare str == str2
        if (str == str2) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal");
        }

        // Compare str.equals(str2)
        if (str.equals(str2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("nStrings are not equal");
        }

        // Compare str == str2.intern()
        if (str == str2.intern()) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("nStrings are not equal");
        }

    }
}
