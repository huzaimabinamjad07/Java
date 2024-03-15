import java.util.Scanner;

public class Task7 {

    public static void count() {
        Scanner sc = new Scanner(System.in);

        int num;
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.println("Enter numbers. Type 'exit' to end.");

        while (true) {
            System.out.print("> ");
            String input = sc.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                break;
            }

            try {
                num = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + input);
                continue;
            }

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zero numbers: " + zeroCount);

        sc.close();
    }

    public static void main(String[] args) {
        count();
    }
}