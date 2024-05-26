public class c1typepromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        int c = b - a;
        System.out.println("98 - 97 = "+ c);

        short d = 5;
        byte e = 25;
        char f = 'a';
        byte bt = (byte)(d + e +f);
        System.out.println(bt);

        int g = 10;
        float h = 22.3f;
        long i = 45;
        double j = 60;
        double ans = g+h+i+j;
        System.out.println(ans);
    }
}
