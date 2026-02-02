// Count Odd number present in user entered number
import java.util.Scanner;

public class CountOddNum {
    public static void main(String[] a) {
        Scanner abc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = abc.nextInt();
        int count = 0;

        while (n > 0) {
            int d = n % 10;
            if (d % 2 == 1) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("Number of Odd Number = " + count);
        abc.close();
    }
}
