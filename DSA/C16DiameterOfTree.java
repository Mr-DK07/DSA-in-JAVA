public class C16DiameterOfTree {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int diameter(Node root) { // TC O(n^2) 1st approach
        if (root == null) {
            return 0;
        }

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int diameter = lh + rh + 1;

        return Math.max(diameter, Math.max(leftDiameter, rightDiameter));
    }

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameterOpt(Node root) { // Optimised TC O(n)
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameterOpt(root.left);
        Info rightInfo = diameterOpt(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Diameter of tree is = " + diameterOpt(root).diam);
        System.out.println("Height of tree is = " + diameterOpt(root).ht);
    }

}
