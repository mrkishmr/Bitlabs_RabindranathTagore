//Write a java program to find the sum of all array elements

import java.util.*;

class Arraysum
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the array size");
      int n=s.nextInt();
      System.out.println("Enter the array elements");
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        {
          a[i]=s.nextInt();
        }
      System.out.println("The elements of the array are");
      for(int i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
      int sum=0;
      for(int i=0;i<n;i++)
        {
          sum=sum+a[i];
        }
      System.out.println("The sum of elements is "+sum);
    }
  }