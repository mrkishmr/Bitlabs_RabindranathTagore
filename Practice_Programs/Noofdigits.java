//Write a JAVA program to count number of digits in a number.

import java.util.*;

class Noofdigits
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a number");
      int n=s.nextInt();
      int temp=n;
      int count=0;
      while(temp!=0)
        {
          int digit=temp%10;
          count++;
          temp=temp/10;
        }
        System.out.println("The number of digits in the number is "+count);
    }
  }