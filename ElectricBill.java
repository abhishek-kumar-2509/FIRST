/*Write a Java program to calculate the electricity bill of a consumer based on the following conditions:
The user enters the number of electricity units consumed.
The charges are calculated as follows:
First 100 units → ₹1 per unit
Next 200 units (101–300) → ₹2 per unit
Next 300 units (301–600) → ₹3 per unit
Above 600 units → ₹5 per unit
A fixed charge of ₹50 is added to the bill.
If the total bill amount exceeds ₹1000, an additional 15% surcharge is applied.
Finally, display the total electricity bill amount. */

import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] a){
        Scanner abc = new Scanner(System.in);
        System.out.print("Enter the Electricity Unit: ");
        int unit = abc.nextInt();
        double Bill;
        if (unit < 100) {
            Bill = 1 * unit;
        }
        else if(unit <=300){
            Bill = 100 + (unit - 100) * 2;
        }
        else if(unit <= 600){
            Bill = 100 + 400 + (unit - 300) * 3;
        }
        else 
            Bill = 100 + 400 + 900 + (unit - 600) * 5;
        Bill +=50;
        if (Bill>1000) {
            Bill = Bill * 1.15;
        }
        System.out.println("Total Amount = " + Bill);
    abc.close();
    }
}
