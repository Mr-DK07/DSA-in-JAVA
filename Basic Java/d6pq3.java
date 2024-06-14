public class d6pq3 {
    public static boolean Polindrome(int pd){
        boolean isPolindrome = false;
        int n = pd;
        int rev = 0;
        
        while(n > 0){
            int lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n /=10;
        }if(rev == pd){
            return true;
        }
        return isPolindrome;
    }
    public static void main(String[] args) {
        System.out.println(Polindrome(128));
    }
}
