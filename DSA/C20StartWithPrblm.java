public class C20StartWithPrblm {
    static class Node {
        Node[] children = new Node[26];
        boolean eow;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        int idx = 0;

        for (int level = 0; level < word.length(); level++) {
            idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        int idx = 0;

        for (int level = 0; level < key.length(); level++) {
            idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    public static boolean startWith(String prefix) { // O(L)
        Node curr = root;

        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = { "apple", "app", "mango", "man", "woman" };
        String prefix = "app";
        String prefix2 = "moon";

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        
        System.out.println(startWith(prefix));
        System.out.println(startWith(prefix2));
    }
}
