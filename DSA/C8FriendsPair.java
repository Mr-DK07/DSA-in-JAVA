public class C8FriendsPair {

    public static int friendsPair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // // single
        // int fnm1 = friendsPair(n - 1);

        // // pair
        // int fnm2 = friendsPair(n - 2);

        // int pairWays = (n - 1) * fnm2;
        // int totalWays = fnm1 + pairWays;

        return friendsPair(n-1) + (n-1) * friendsPair(n-2);
    }

    public static void main(String[] args) {
        System.out.println(friendsPair(3));
    }
}
