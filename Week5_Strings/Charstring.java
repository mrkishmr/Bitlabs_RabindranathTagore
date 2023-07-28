//Write a Java program to get the character at the given index within the String

import java.util.*;

class Charstring
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String s1=new String();
      s1=sc.nextLine();
      System.out.println(s1.charAt(5));
    }
  }