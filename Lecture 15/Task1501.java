import java.util.Scanner;

public class Task1501 {
    public static Scanner sc = new Scanner(System.in);

    public static int getBit(int num, int pos) {
        int bit = num & (1 << pos);

        if (bit > 0) {
            return 1;
        }

        return 0;
    }

    public static int setBit(int num, int pos) {
        return num | (1 << pos);
    }

    public static int clearBit(int num, int pos) {
        return num & (~(1 << pos));
    }

    public static int updateBit(int num, int pos) {
        int bit = getBit(num, pos);

        if (bit == 1) {
            return clearBit(num, pos);
        }

        return setBit(num, pos);
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        System.out.println("===== Before Bit Manipulation =====");
        System.out.println("Number = " + num);
        System.out.println("Position = " + pos);
        System.out.println("Bit at " + pos + " = " + getBit(num, pos));

        num = updateBit(num, pos);

        System.out.println("\n===== After Bit Manipulation =====");
        System.out.println("Number = " + num);
        System.out.println("Position = " + pos);
        System.out.println("Bit at " + pos + " = " + getBit(num, pos));
    }
}
