public class c4Strings1 {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "Tony Stark";
        String str1 = "Mony Stark";
        String str2 = "Tony Stark";
        System.out.println(str.charAt(5));
       // printLetters(str);
       System.out.println(str.replace("o","i"));
       System.out.println(str.equals(str1) + " " + str.equals(str2));

    }
}
