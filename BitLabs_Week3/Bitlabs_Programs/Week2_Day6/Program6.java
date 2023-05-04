// program to illustrate relational operator

import java.util.Scanner;//import scanner class

public class Program6{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the age");
    int age=sc.nextInt();
    System.out.println("Enter the monthly income");
    int income=sc.nextInt();
    if((age>20)&&(income>50000))
      System.out.println("Both conditions are satisfied");
    else
      System.out.println("Some condition is not satisfied");
  } 
}