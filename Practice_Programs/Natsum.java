//Write a JAVA program to find sum of all natural numbers between 1 to n.

import java.util.*;

class Natsum
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the maximum value");
      int n=sc.nextInt();
      int i=1,sum=0;
      while(i<=n)
        {
          sum=sum+i;
          i++;
        }
      System.out.println("The sum of natural numbers is "+sum);
    }
  }