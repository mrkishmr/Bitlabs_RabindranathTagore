//Write a Java program to concatenate a given string to the end of another string

import java.util.*;

class Concat
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a string");
      String s1=sc.nextLine();
      System.out.println("Enter another string to be combined with another string");
      String s2=sc.nextLine();
      String s3=s1.concat(s2);
      System.out.println("The modified string is"+'\n'+s3);
    }
  }