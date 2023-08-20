//Write a JAVA program to print all Perfect numbers between 1 to n.

import java.util.*;

class Perfect
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the end range");
      int n=sc.nextInt();
      System.out.println("The perfect numbers between the range 1 to "+n+" are");
      for(int i=1;i<n;i++)
        {
          int sum=0;
          for(int j=1;j<i;j++)
          {
          if(i%j==0)
          {
            sum=sum+j;
          }
          }
          if(sum==i)
          {
              System.out.println(i);
          }
        } 
    }
  }