//Leap Year Checker: Create an application that takes a year as input and checks if it's a leap year. Use conditional statements to determine if the year is a leap year based on the rules for determining leap years

import java.util.*;

public class Program4
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the year");
    int year=sc.nextInt();
    if((year%4)==0)
      System.out.println("The year is a leap year");
    else
    {
      if((year%100==0)&&(year%400==0))
      {
        System.out.println("The year is a leap year");  
      }
      else
      {
        System.out.println("The year is not a leap year");
      }
    } 
    
  }  
}