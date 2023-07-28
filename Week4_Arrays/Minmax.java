//Write a Java program to find the maximum and minimum elements in an array.

import java.util.*;

class Minmax
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the array size");
      int n=s.nextInt();
      System.out.println("Enter the array elements");
      int a[]=new int[n];
      int i;
      for(i=0;i<n;i++)
        {
          a[i]=s.nextInt();
        }
      System.out.println("The elements of the array are:");
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
      int minnum=a[0];
      int maxnum=a[0];
      for(i=0;i<n;i++)
        {
          if(a[i]>maxnum)
            maxnum=a[i];
          if(a[i]<minnum)
            minnum=a[i];
        }
      System.out.println("Maximum element in the array is "+maxnum);
      System.out.println("Minumum element in the array is "+minnum);
      
    }
  }