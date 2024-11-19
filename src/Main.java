import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int m = scanner.nextInt();
        System.out.println("Please enter the second number: ");
        int n = scanner.nextInt();
        int power = 1;
        for (int i = 1; i <= n; i++) {
            power *= m;
            System.out.println("your answer is :" +power);

        }
    }
}
