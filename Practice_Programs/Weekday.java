//Write a JAVA program to input week number and print week day.

import java.util.*;

class Weekday
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the week no");
      int n=sc.nextInt();
      if(n==1)
        System.out.println("Monday");
      else if(n==2)
        System.out.println("Tuesday");
      else if(n==3)
        System.out.println("Wednesday");
      else if(n==4)
        System.out.println("Thursday");
      else if(n==5)
        System.out.println("Friday");
      else if(n==6)
        System.out.println("Saturday");
      else if(n==7)
        System.out.println("Sunday"); 
      else
        System.out.println("Please enter a valid Date!");
    }
  }