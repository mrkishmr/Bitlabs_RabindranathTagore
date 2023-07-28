// Write a java program to count the total number of even and odd elements in an array.

import java.util.*;

class Evenodd
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the array size");
      int n=s.nextInt();
      System.out.println("Enter the array elements");
      int a[]=new int[n];
      int i,evencount=0,oddcount=0;
      for(i=0;i<n;i++)
        {
          a[i]=s.nextInt();
        }
      System.out.println("The elements of the array are");
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
      System.out.println("Even elements of the array are");
      for(i=0;i<n;i++)
        {
          if((a[i]%2)==0)
          {
            System.out.println(a[i]);
            evencount=evencount+1;
          }
        }
      System.out.println("Odd elements of the array are");
      for(i=0;i<n;i++)
        {
          if((a[i]%2)!=0)
          {
            System.out.println(a[i]);
            oddcount=oddcount+1;
          }
        }
      System.out.println("The number of even elements in array are "+evencount);
        System.out.println("The number of odd elements in array are "+oddcount);
    }
  }