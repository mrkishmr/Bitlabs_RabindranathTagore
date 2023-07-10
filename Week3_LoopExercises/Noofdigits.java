//Write a java program to print number of digits in a given number

import java.util.*;

class Noofdidits
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a number");
      int n=s.nextInt();
      int temp=n;
      while(temp!=0)
        {
          int digit=temp%10;
          sum=sum+digit;
          temp=temp/10;
        }
        System.out.println(sum);
    }
  }