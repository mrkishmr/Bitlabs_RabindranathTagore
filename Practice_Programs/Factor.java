//Write a JAVA program to find all factors of a number.

import java.util.*;

class Factor
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int n=sc.nextInt();
      System.out.println("The factors of "+n+" are:");
      for(int i=1;i<n;i++)
        {
          System.out.print(i+",")
        }
    }
  }