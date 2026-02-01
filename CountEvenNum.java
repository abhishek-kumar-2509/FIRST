// Count even number present in user entered number 
import java.util.Scanner;
public class CountEvenNum {
    public static void main(String[] a){
        Scanner abc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = abc.nextInt();
        int count = 0;
        
        while(n > 0){
        int d = n % 10;
            if(d % 2 == 0){
                count++;
            }
        n = n / 10;
        }
        System.out.println("Number of Even Number = " + count);
        abc.close();
    }
}
