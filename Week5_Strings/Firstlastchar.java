//Write a java program to display first  & last character of every word in a given string.

import java.util.*;

class Firstlastchar
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
      System.out.println("Printing first and character of each word");
      for(int i=0;i<b.length;i++)
        {
          String s2=b[i];
          char first=s2.charAt(0);
          char last=s2.charAt(s2.length()-1);
          System.out.println("The first character of "+b[i]+" is "+first);
          System.out.println("The last character of "+b[i]+" is "+last);
        }
    }
  }