//Write a JAVA program to print all negative elements in an array.

import java.util.*;

class Negelements
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
      System.out.println("The elements of the array are");
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
      System.out.println("The negative elements of the array are");
      for(i=0;i<n;i++)
        {
          if(a[i]<0)
          {
            System.out.println(a[i]);
          }
        }
  }