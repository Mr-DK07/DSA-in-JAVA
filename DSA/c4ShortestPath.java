package DSA;

public class c4ShortestPath {
    public static float ShortestDist(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // North
            if (dir == 'N') {
                y++;
            }
            // South
            else if (dir == 'S') {
                y--;
            }
            // East
            else if (dir == 'E') {
                x++;
            }
            // West
            else {
                x--;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;

        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(ShortestDist(path));
    }
}