// Write a JAVA program to check whether a character is uppercase or lowercase alphabet.

import java.util.*;

class Alphabet
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter an alphabet");
      char ch=sc.next().charAt(0);
      if((ch>=65&&ch<=90))
        System.out.println(ch+" is an uppercase alphabet");
      else if(ch>=97&&ch<=122)
        System.out.println(ch+" is a lowercase alphabet");
    }
  }