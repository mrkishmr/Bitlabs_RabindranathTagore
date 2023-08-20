//Write a JAVA program to find sum of all prime numbers between 1 to n.

import java.util.Scanner;

class Primerange 
{
    public static void main(String ar[]) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the start range:");
        int n1 = s.nextInt();
        System.out.println("Enter the end range:");
        int n2 = s.nextInt();
        int sum=0;
        for (int i=n1;i<=n2;i++)
          {
            boolean temp = true;
            if (i<=1) 
            {
                temp = false;
            } 
            else 
            {
                for (int j=2; j<i;j++) 
                {
                    if (i%j==0) 
                    {
                        temp=false;
                        break;
                    }
                }
            }
            if (temp) 
            {
                sum=sum+i;
            }
        }
      System.out.println("Sum of prime numbers between "+n1+" and "+n2+" = "+sum);
    }
}