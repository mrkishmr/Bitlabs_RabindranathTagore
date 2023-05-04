//Program to find maximum between two numbers

import java.util.Scanner;//import scanner class

public class Program1
  {
    public static void main(String[] args)//main method
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first value");
      int a=sc.nextInt();//Read the first number
      System.out.println("Enter the second value");
      int b=sc.nextInt();//Read the second number
      if(a>b)
        System.out.println(a +" is the largest number");
      else
        System.out.println(b +" is the largest number");
    }
  }