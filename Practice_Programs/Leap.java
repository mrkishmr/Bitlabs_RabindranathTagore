//6. Write a JAVA program to check whether a year is leap year or not.

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