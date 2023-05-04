//Program to check whether a number is negative, positive or zero

import java.util.Scanner;//import scanner class

public class Program3
  {
    public static void main(String[] args)//main method
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();//Read the number
      if(n<0)
        System.out.println("n is a negative number");
      else if(n>0)
        System.out.println("n is a positive number");
      else
        System.out.println("n is equal to zero");
    }
  }