//Write a java program to count the total number of duplicate elements in an array.

import java.util.*;

class Duplicatecount
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Declare the array size");
      int n=s.nextInt();
      System.out.println("Enter the array elements");
      int a[]=new int[n];
      int i,count=0;
      for(i=0;i<n;i++)
        {
          a[i]=s.nextInt();
        }
      System.out.println("The array elements are:");
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
      for(i=0;i<n;i++)
        {
          
          for(int j=i+1;j<n;j++)
            {
               if(a[j]==a[i])
                 count=count+1;
                 break;
            }
        }
      System.out.println("The number of duplicate elements in the array is "+count);
    }
  }