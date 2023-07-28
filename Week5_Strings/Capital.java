//Write a java program to capitalize first character of every word in a given string.

import java.util.*;

class Capital
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String s1=new String();
      s1=sc.nextLine();
      System.out.println(s1);
      String b[]=s1.split(" ");
      String s2="";
      for(int i=0;i<b.length;i++)
        {
          char c[]=b[i].toCharArray();
          b[i]=b[i].replace(b[i].charAt(0),Character.toUpperCase(c[0]));
          s2=s2+b[i]+" ";
        }
      System.out.println(s2);
    }
  }