// Write a JAVA program to find second largest element in an array.

import java.util.*;

class Secondlarge
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Declare the array size");
      int n=s.nextInt();
      System.out.println("Enter the array elements");
      int a[]=new int[n];
      int i,j,temp,secondmax=0,max=0;
      for(i=0;i<n;i++)
        {
          a[i]=s.nextInt();
        }
      System.out.println("Displaying array elements");
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
     for(i=0;i<n;i++)
       {
         secondmax=0;
         max=0;
         if(a[i]>max)
         {
            max=a[i];
            secondmax=max;
         }
       }
      System.out.println("The second largest element in the array is "+secondmax);
    }
  }