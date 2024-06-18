package DSA;

public class c4Strings1 {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "Tony Stark";
        System.out.println(str.charAt(5));
        printLetters(str);
    }
}
