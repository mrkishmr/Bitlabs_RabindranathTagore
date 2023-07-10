//Factorial Calculator: Write a program that calculates the factorial of a given number. Use a loop to multiply all numbers from given number to 1 together.

import java.util.*;

class Factorial
  {
    public static void main(String ar[])
    {
      Scanner mk=new Scanner(System.in);
      System.out.println("Enter the number to find the factorial");
      int n=mk.nextInt();
      int fact=1,j=n;
      while(j>0)
        {
          fact=fact*j;
          j--;
        }
      System.out.println("The factorial of "+n+" is "+fact);
    }
  }