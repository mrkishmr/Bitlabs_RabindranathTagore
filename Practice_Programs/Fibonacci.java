//Write a JAVA program to print Fibonacci series up to n terms

import java.util.*;

class Fibonacci
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of terms");
      int n=sc.nextInt();
      int sum=0;
      int n1=0,n2=1;
      System.out.println("First term "+n1+" Second term "+n2);
      for(int i=0;i<n;i++)
        {
          sum=n1+n2;
          System.out.print(" "+sum);
          n1=n2;
          n2=sum;
        }
    }
  }