import java.util.HashSet;

public class Task1808 {
    public static void printSubseq(String str, int idx, String res, HashSet<String> allSubseq) {
        if (idx == str.length()) {
            if (allSubseq.contains(res)) {
                return;
            }
            allSubseq.add(res);
            System.out.println(res);
            return;
        }
        // Choose
        printSubseq(str, idx + 1, res + str.charAt(idx), allSubseq);

        // Don't choose
        printSubseq(str, idx + 1, res, allSubseq);
    }

    public static void main(String args[]) {
        // String str1 = "abc";
        String str2 = "aaa";

        HashSet<String> allSubseq = new HashSet<>();

        printSubseq(str2, 0, "", allSubseq);
    }
}