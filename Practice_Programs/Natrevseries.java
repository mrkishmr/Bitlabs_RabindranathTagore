//Write a JAVA program to print all natural numbers in reverse (from n to 1). - using while loop

import java.util.*;

class Natrevseries
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the start range");
      int n=sc.nextInt();
      int i=n;
      while(i>=1)
        {
          System.out.println(i);
          i--;
        }
    }
  }