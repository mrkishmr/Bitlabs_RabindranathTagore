//Program to print all natural numbers from 1 to n. - using while loop

import java.util.*;

public class Program1
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of n");
      int n=sc.nextInt();
      int count=0;
      while(count<n)
        {
          count=count+1;
          System.out.println(count);
        }
    }
  }