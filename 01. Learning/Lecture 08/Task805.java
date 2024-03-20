import java.util.Scanner;

public class Task805 {
    public static boolean canVote(int n) {
        return n >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        System.out.println("Vote = " + canVote(sc.nextInt()));

        sc.close();
    }
}