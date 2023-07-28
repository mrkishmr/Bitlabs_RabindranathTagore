//Write a java program to display longest word and smallest word in a given string.

import java.util.*;

class Longsmall
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String s1=new String();
      s1=sc.nextLine();
      String b[]=s1.split(" ");
      String smallword=b[0];
      String longword=b[0];
      for(int i=0;i<b.length;i++)
        {
          String word=b[i];
          if(word.length()>longword.length())
          {
            longword=word;
          }
          if(word.length()<smallword.length())
          {
            smallword=word;
          }
        }
      System.out.println("The longest word in the string is "+longword);
      System.out.println("The shortest word in the string is "+smallword);
    }
  }