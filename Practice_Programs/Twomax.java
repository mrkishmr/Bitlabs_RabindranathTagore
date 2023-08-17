//1. Write a JAVA program to find maximum between two numbers.

import java.util.*;

class Twomax
  {
    public static void main(String ar[])
    {
      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the numbers");
      a=sc.nextInt();
      b=sc.nextInt();
      if(a>b)
        System.out.println(a+" is greater");
      else
        System.out.println(b+" is greater");
    }
  }