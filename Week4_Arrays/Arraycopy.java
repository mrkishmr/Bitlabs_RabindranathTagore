//Write a java program to copy all elements from one array to another array.

import java.util.*;

class Arraycopy
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
      System.out.println("The elements of array a are");
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
      int b[]=new int[n];
      System.out.println("Copying elements to array b");
      for(i=0;i<n;i++)
        {
          b[i]=a[i];
        }
      System.out.println("The elements in array b are");
      for(i=0;i<n;i++)
      {
        System.out.println(b[i]);
      }
    }
  }