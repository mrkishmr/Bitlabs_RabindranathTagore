//Program to find maximum between three numbers

import java.util.Scanner;//import scanner class

public class Program2
  {
    public static void main(String[] args)//main method
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first value");
      int a=sc.nextInt();//Read the first number
      System.out.println("Enter the second value");
      int b=sc.nextInt();//Read the second number
      System.out.println("Enter the third value");
      int c=sc.nextInt();//Read the third number
      if((a>b)&&(a>c))
        System.out.println(a +" is the largest number");
      else if((b>a)&&(b>c))
        System.out.println(b +" is the largest number");
      else
        System.out.println(c +" is the largest number");
    }
  }