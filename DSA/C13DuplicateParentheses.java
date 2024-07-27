import java.util.Stack;

public class C13DuplicateParentheses {

    public static boolean isDuplicate(String str) { //TC O(n)
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == ')'){
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true; // duplicate
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((c+d)+(a+b))";
        String str2 = "((c+d))";
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));

    }
}
