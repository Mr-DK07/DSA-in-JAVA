package DSA;

public class C4StrCompression {

    public static String CompressString(String str){
        String Cstr = "";

        for(int i = 0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count ++;
                i++;
            }
            Cstr += str.charAt(i);
            if(count > 1){
                Cstr += count.toString();
            }
        }
        return Cstr;
    }
    public static void main(String[] args) {
        String str = "aaabbcccd";
        System.out.println(CompressString(str));
    }
}
