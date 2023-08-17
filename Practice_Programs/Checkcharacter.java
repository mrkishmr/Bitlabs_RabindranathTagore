//Write a JAVA program to input any character and check whether it is alphabet, digit or special character.

import java.util.*;

class Alphabet
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a character");
      char ch=sc.next().charAt(0);
      if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
        System.out.println(ch+" is an alphabet");
      else if(ch>=48&&ch<=57)
        System.out.println(ch+" is a digit");
      else
        System.out.println(ch+" is a special character");
    }
  }