import java.util.Arrays;

public class D4pq2Anagrams {

    public static void Anagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean result = Arrays.equals(str1charArray, str2charArray);

            if (result) {
                System.out.println("these are anagrams");
            } else {
                System.out.println("these are not anagrams");
            }
        } else {
            System.out.println("these are not anagrams");
        }
    }

    public static void main(String[] args) {
        String str1 = "Eath";
        String str2 = "Heart";

        Anagrams(str1, str2);
    }
}
