//Write a JAVA program to find frequency of each digit in a given integer.

import java.util.Scanner;

class Digitfreq 
{
    public static void main(String ar[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        int digfreq[] = new int[10];
        while (n!=0) 
        {
            int digit=n%10;
            digfreq[digit]++;
            n=n/10;
        }
        for (int i = 0; i < 10; i++) 
        {
            if (digfreq[i] > 0) 
            {
                System.out.println("Digit " + i + " occurence: " + digfreq[i] );
            }
        }
    }
}