package DSA;
public class C4StrBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        // sb.toString(); 
        for(char ch ='a'; ch< 'z'; ch++){
            sb.append(ch);
        }

        System.out.println(sb);
    }
}