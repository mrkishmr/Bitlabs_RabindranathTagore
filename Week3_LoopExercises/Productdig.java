//Write a java program to find product of digits of a given number

import java.util.*;

class Productdig
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a number");
      int n=s.nextInt();
      int temp=n,product=1;
      while(temp!=0)
        {
          int digit=temp%10;
          product=product*digit;
          temp=temp/10;
        }
        System.out.println(product);
    }
  }