//Program to check whether a number is even or odd

import java.util.Scanner;//import scanner class

public class Program5
  {
    public static void main(String[] args)//main method
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();//Read the number
      if(n%2==0)
        System.out.println(n +" is an even number");
      else
        System.out.println(n +" is an odd number");
    }
  }