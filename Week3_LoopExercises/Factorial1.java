//Factorial Calculator: Write a program that calculates the factorial of a given number. Use a loop to multiply all numbers from 1 to the given number together.

import java.util.*;

class Factorial1
  {
    public static void main(String ar[])
    {
      Scanner mk=new Scanner(System.in);
      System.out.println("Enter the number to find the factorial");
      int n=mk.nextInt();
      int fact=1,j=1;
      while(j<=n)
        {
          fact=fact*j;
          j++;
        }
      System.out.println("The factorial of "+n+" is "+fact);
    }
  }