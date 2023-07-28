//Write a java program to convert String to an integer

import java.util.*;

class Strint
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a string");
      String s1=sc.nextLine();
      int a=Integer.parseInt(s1);
      System.out.println("The equivalent integer value is "+a);
    }
  }