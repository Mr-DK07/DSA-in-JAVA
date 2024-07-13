public class C8DuplicateString {

    public static void removeDuplicate(String str, int i, StringBuilder newStr, boolean map[]) {
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(i);
        if (map[currChar - 'a'] == true) {
            removeDuplicate(str, i + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, i + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnabbd";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
