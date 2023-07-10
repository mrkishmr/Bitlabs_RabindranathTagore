//Write a java program to calculate sum of digits of a number.

import java.util.*;

class Digsum
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a number");
      int n=s.nextInt();
      int temp=n,sum=0;
      while(temp!=0)
        {
          int digit=temp%10;
          sum=sum+digit;
          temp=temp/10;
        }
        System.out.println(sum);
    }
  }