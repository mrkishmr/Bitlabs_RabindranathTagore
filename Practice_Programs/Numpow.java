//Write a JAVA program to find power of a number using for loop.

import java.util.*;

class Numpow
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