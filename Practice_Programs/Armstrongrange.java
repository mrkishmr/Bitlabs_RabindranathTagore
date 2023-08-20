//Write a JAVA program to print all Armstrong numbers between 1 to n.

import java.util.*;

class Armstrong
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      int n1=1;
      System.out.println("Enter the end range");
      int n2=sc.nextInt();
      System.out.println("The armstrong numbers between the range 1 to "+n+" are");
      for(int i=n1;i<=n2;i++)
        {
          int temp=i;
          int sum=0;
          while(temp>0)
            {
              int digit=temp%10;
              sum=sum+(digit*digit*digit);
              temp=temp/10;
            }
          if(sum==i)
          {
            System.out.println(sum);
          }
        }
    }
  }