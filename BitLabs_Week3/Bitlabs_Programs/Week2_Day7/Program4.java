//Program to check whether a number is divisible by 5 and 11 or not

import java.util.Scanner;//import scanner class

public class Program4
  {
    public static void main(String[] args)//main method
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();//Read the number
      if((n%5==0)&&(n%11==0))
        System.out.println(n +" is divisible by 5 and 11");
      else
        System.out.println(n +" is not divisible by 5 and 11");
    }
  }