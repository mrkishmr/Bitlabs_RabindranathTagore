//Write a JAVA program to check whether a number is Armstrong number or not.

import java.util.*;

class Armstrong
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int n=sc.nextInt();
          int temp=i;
          int sum=0;
          while(temp>0)
            {
              int digit=temp%10;
              sum=sum+(digit*digit*digit);
              temp=temp/10;
            }
          if(sum==n)
          {
            System.out.println(n+" is an armstrong number");
          }
          else
          {
            System.out.println(n+" is not an armstrong number");
          }
    }
  }