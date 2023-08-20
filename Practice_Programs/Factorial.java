//Write a JAVA program to calculate factorial of a number.

import java.util.*;

class Factorial
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to find the factorial");
      int n=sc.nextInt();
      int fact=1,j=n;
      while(j>0)
        {
          fact=fact*j;
          j--;
        }
      System.out.println("The factorial of "+n+" is "+fact);
    }
  }