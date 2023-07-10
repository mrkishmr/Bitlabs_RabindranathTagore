//Write a program that calculates the power of a number. Take two inputs from the user, the base number and the exponent, and calculate the result using a loop.

import java.util.*;

class Pow
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      long base=s.nextLong();
      int exponent=s.nextInt();
      long power=1;
      int j=1;
      do
      {
       power=power*base;
          j=j+1;
      }
      while(j<=exponent);
      System.out.println(power);
    }
  }