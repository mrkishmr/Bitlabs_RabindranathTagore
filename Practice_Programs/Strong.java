//Write a JAVA program to check whether a number is Strong number or not.

import java.util.*;

class Strong
{
  public static void main(String ar[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    int temp=n,sum=0;
    while(temp>0)
      {
        int digit=temp%10;
        int fact=1;
        while(digit>0)
          {
            int fact=fact*digit;
            sum=sum+fact;
            digit--;
          }
        temp=temp/10;
      }
    if(sum==n)
      {
        System.out.println(n+" is a strong number");
      }
      else
      {
        System.out.println(n+" is not a strong number");
      }
  }
}