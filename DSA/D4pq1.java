package DSA;

import java.util.Scanner;

public class D4pq1 {

    public static int countVowel(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        System.out.println("Number of lowercase vowels is : " + countVowel(str));
        sc.close();

    }
}
