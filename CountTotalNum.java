// Count Total number present in user entered number
import java.util.Scanner;

public class CountTotalNum {
    public static void main(String[] a) {
        Scanner abc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = abc.nextInt();
        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Total Number = " + count);
        abc.close();
    }
}
