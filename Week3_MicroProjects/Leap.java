//4. Leap Year Checker: Create an application that takes a year as input and checks if it's a leap year. Use conditional statements to determine if the year is a leap year based on the rules for determining leap years.

import java.util.*;

class Leap
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a year");
      int year=s.nextInt();
      if((year%4)==0)
      {
        if((year%100)==0)
        {
          if((year%400)==0)
            System.out.println(year+ " is a leap year");
          else
            System.out.println(year+ " is not a leap year");
        }
        else
          System.out.println(year+ " is a leap year");
      }
      else
        System.out.println(year+ " is not a leap year");
  }
  }