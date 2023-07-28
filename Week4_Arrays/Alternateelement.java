//Write a java program to Print the Alternate Elements in an Array

import java.util.*;

class Alternateelement
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Declare the array size");
      int n=s.nextInt();
      System.out.println("Enter the array elements");
      int a[]=new int[n];
      int i;
      for(i=0;i<n;i++)
        {
          a[i]=s.nextInt();
        }
      System.out.println("The Elements of the array are");
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
      System.out.println("Printing alternate elements of the array");
      for(i=0;i<n;i+=2)
        {
          System.out.println(a[i]);
        }
    }
  }