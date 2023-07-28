//Write a Java program to find the index of an array element.

import java.util.*;

class Index
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
      System.out.println("The array elements are");
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
      int index=-1;
      System.out.println("Enter the element to find its index in the array");
      int element=s.nextInt();
      for(i=0;i<n;i++)
        {
          if(element==a[i])
          {
            index=i;
            break;
          }
        }
          if(index!=-1)
            System.out.println(element+" is present in the array at index "+index);
          else
            System.out.println(element+" is not present in the array");
             
    }
  }