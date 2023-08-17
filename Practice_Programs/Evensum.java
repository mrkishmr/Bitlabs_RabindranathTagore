// Write a JAVA program to find sum of all even numbers between 1 to n.

import java.util.*;

class Evensum
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the end range");
      int n=sc.nextInt();
      int i=1,sum=0;
      while(i<=n)
        {
          if(i%2==0)
          {
           sum=sum+i;
          }
          i++;
        }
      System.out.println("Sum of even numbers "+sum);
    }
  }