import java.util.Scanner;

public class Task806 {
    public static void infiniteFunction() {
        do {
            System.out.println("I'm running infinitely!");
            infiniteFunction();
        } while (true);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        infiniteFunction();

        sc.close();
    }
}