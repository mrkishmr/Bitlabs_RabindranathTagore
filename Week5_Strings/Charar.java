//Write a Java program to create a new String object with the contents of a character array.

import java.util.*;

class Charar
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the char array size");
      int n=sc.nextInt();
      System.out.println("Enter the set of characters");
      char c[]=new char[n];
      for(int i=0;i<c.length;i++)
        {
          c[i]=sc.next().charAt(0);
        }
      String s1=new String(c);
      System.out.println(s1);
    }
  }
      
     