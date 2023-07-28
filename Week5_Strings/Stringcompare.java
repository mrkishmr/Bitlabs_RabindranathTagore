//Write a Java program to compare a given string to another string, ignoring case considerations.

import java.util.*;

class Stringcompare
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first string");
      String s1=new String();
      s1=sc.nextLine();
      System.out.println("Enter second string");
      String s2=new String();
      s2=sc.nextLine();
      if(s1.equalsIgnoreCase(s2))
      {
        System.out.println("Both strings are similar");
      }
      else
      {
        System.out.println("Both strings are different");
      }
    }
  }