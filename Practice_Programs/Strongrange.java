//Write a JAVA program to print all Strong numbers between 1 to n.

//Write a JAVA program to check whether a number is Strong number or not.

import java.util.*;

class Strongrange
{
  public static void main(String ar[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the endrange");
    int n=sc.nextInt();
    System.out.println("The strong numbers between the range 1 to "+n+" are");
    for(int i=1;i<=n;i++)
    {
      int temp=i,sum=0;
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
    if(sum==i)
      {
        System.out.println(i);
      }
  }
}