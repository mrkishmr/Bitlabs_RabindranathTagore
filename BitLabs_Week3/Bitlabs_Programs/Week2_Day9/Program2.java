//Program to print all natural numbers from 1 to n in reverse order - using while loop

import java.util.*;

public class Program2
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of n");
      int n=sc.nextInt();
      int count=n;
      while(count>1)
        {
          count=count-1;
          System.out.println(count);
        }
    }
  }