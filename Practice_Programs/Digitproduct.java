//Write a JAVA program to calculate product of digits of a number.

import java.util.*;

class Digitproduct
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a number");
      int n=s.nextInt();
      int temp=n;
      int product=1;
      while(temp!=0)
        {
          int digit=temp%10;
          product=product*digit;
          temp=temp/10;
        }
        System.out.println("The product of digits is "+product);
    }
  }