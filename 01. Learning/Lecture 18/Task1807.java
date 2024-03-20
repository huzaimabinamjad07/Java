public class Task1807 {
    public static void printSubseq(String str, int idx, String res) {
        if (idx == str.length()) {
            System.out.println(res);
            return;
        }

        // Choose
        printSubseq(str, idx + 1, res + str.charAt(idx));

        // Dont' choose
        printSubseq(str, idx + 1, res);
    }

    public static void main(String args[]) {
        String str1 = "abc";

        // String str2 = "aaa";

        printSubseq(str1, 0, "");
    }
}