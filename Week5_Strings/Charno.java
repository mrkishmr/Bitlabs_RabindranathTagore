//Write a java program to find number of characters in a given string.

import java.util.*;

class Charno
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a string");
      String s1=new String();
      s1=sc.nextLine();
      System.out.println("The string entered is");
      System.out.println(s1);
      System.out.println("The number of characters in the string are "+s1.length());
    }
  }