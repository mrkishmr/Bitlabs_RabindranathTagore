//Write a JAVA program to print all natural numbers from 1 to n. - using while loop

import java.util.*;

class Natno
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the maximum value");
      int n=sc.nextInt();
      int i=1;
      while(i<=n)
        {
          System.out.println(i);
          i++;
        }
    }
  }