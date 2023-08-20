//Write a JAVA program to check whether a number is Perfect number or not.

import java.util.*;

class Perfect
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int n=sc.nextInt();
      int sum=0;
      for(int i=1;i<n;i++)
        {
          if(n%i==0)
          {
            sum=sum+i;
          }
        }
      if(sum==n)
      {
        System.out.println(n+" is a perfect number");
      }
      else
      {
        System.out.println(n+" is not a perfect number");
      }
    }
  }