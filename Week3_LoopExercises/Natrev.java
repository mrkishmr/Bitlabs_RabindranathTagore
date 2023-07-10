//Write a java program to print all natural numbers in reverse (from n to 1) using while loop

import java.util.*;

class Natrev
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the start range");
      int n=s.nextInt();
      int i=n;
      while(i>=1)
        {
          System.out.println(i);
          i--;
        }
    }
  }