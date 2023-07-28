//Write a Java program to insert an element (specific position) into an array.

import java.util.*;

class Insert
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Declare the array size");
      int n=s.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=s.nextInt();
        }
      System.out.println("The elements of the array is: ");
      for(int i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
      System.out.println("Enter a number");
      int d=s.nextInt();
      System.out.println("Enter the position to add data");
      int b=s.nextInt();
      for(int i=b;i<=n-1-b;i++)
        {
          a[i]=a[i-1];
        }
      a[b]=d;
      System.out.println("The array after adding element is:");
      for(int i=0;i<n;i++)
      System.out.println(a[i]);  
    }
  }