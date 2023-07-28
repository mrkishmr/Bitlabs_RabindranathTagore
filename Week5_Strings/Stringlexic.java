//Write a Java program to compare two strings lexicographically
//Lexicographically means coming in the order of dictionary

import java.util.*;

class Stringlexic
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      String s1=new String();
      String s2=new String();
      System.out.println("Enter the first string");
      s1=sc.nextLine();
      System.out.println("Enter the second string");
      s2=sc.nextLine();
      int order=s1.compareTo(s2);
      if(order<0)
      {
        System.out.println(s1+" comes before "+s2);
      }
      else if(order>0)
      {
        System.out.println(s1+" comes after "+s2);
      }
      else
      {
        System.out.println("Both strings are same");
      }
    }
  }