/* Write a JAVAprogram to input electricity unit charges and calculate total electricity bill according to the given condition:

For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit

An additional surcharge of 20% is added to the bill */

import java.util.*;

class Ebill
{
    public static void main(String ar[]) 
    {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter the no of units consumed");
        int units = sc.nextInt();
        float total;
        if (units <= 50) 
        {
            total= units * 0.50f;
        } 
        else if (units <= 150)
        {
            total = 50 * 0.50f + (units - 50) * 0.75f;
        } 
        else if (units <= 250) 
        {
            total= 50 * 0.50f + 100 * 0.75f + (units - 150) * 1.20f;
        } 
        else 
        {
            total= 50 * 0.50f + 100 * 0.75f + 100 * 1.20f + (units - 250) * 1.50f;
        }        
        float surcharge=0.2f * total;
        total=total+surcharge;
        System.out.println("Total Electricity Bill: Rs. "+total);
    }
}