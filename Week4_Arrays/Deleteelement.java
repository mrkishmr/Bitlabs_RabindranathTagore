//Write a java program to delete an element from an array at a specified position.

import java.util.*;

class Deleteelement 
{
    public static void main(String ar[]) 
  {
        Scanner s = new Scanner(System.in);
        System.out.println("Declare the array size");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements");
        for (int i=0;i<n;i++)
          {
            a[i] = s.nextInt();
          }
        System.out.println("The elements of the array are:");
        for (int i=0;i<n;i++) 
        {
            System.out.println(a[i]);
        }
        System.out.println("Enter the position to delete data");
        int index=s.nextInt();
        if (index>=0&&index<n)
        {
            for (int i=index;i<n-1;i++)
            {
              a[i]=a[i+1];
            }
            n--;
            System.out.println("The array after deleting the element is:");
            for (int i=0;i<n;i++)
            {
              System.out.println(a[i]);
            }
        } 
        else 
        {
            System.out.println("Index out of range");
        }
    }
}
