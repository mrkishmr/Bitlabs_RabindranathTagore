//Write a java program to display first character of every word in a given string.

import java.util.*;

class Firstchar
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String s1=new String();
      s1=sc.nextLine();
      System.out.println("Splitting the words");
      String b[]=s1.split(" ");
      for(int i=0;i<b.length;i++)
        {
          System.out.println(b[i]);
        }
      System.out.println("Printing first character of each word");
      for(int i=0;i<b.length;i++)
        {
          System.out.println("The first character of "+b[i]+" is "+b[i].charAt(0));
        }
    }
  }