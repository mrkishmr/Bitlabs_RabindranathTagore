//Write a Java program to find the common elements between two arrays
import java.util.*;

class Commonarray
  {
 public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the array size for a");
      int m=s.nextInt();
      System.out.println("Enter the array elements for a");
      int a[]=new int[m];
      int i,j;
      for(i=0;i<m;i++)
        {
          a[i]=s.nextInt();
        }
      System.out.println("Enter the array size for b");
      int n=s.nextInt();
      System.out.println("Enter the array elements for b");
      int b[]=new int[n];
       for(j=0;j<n;j++)
        {
          b[j]=s.nextInt();
        }
      System.out.println("The elements of array a are");
      for(i=0;i<m;i++)
        {
          System.out.println(a[i]);
        }
      System.out.println("The elements of array b are");
      for(j=0;j<n;j++)
        {
          System.out.println(b[j]);
        }
      System.out.println("The common elements from array a and b are");
      for(i=0;i<m;i++)
        {
          for(j=0;j<n;j++)
            {
              if(b[j]==a[i])
                System.out.println(b[j]);
            }
        }
    }
  }