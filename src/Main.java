import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(factorial(in.nextInt()));
        printNumbersUp(in.nextInt());
    }

    public static int factorial(int a) {
        //a--;
        if (a == 1 || a == 0) {
            return 1;
        }
        return a * factorial(a - 1);
    }

    public static void printNumbersUp(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println(i);
        }
    }
}
