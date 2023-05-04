//Program to check whether a character is alphabet or not

import java.util.*;

public class Program6
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a character");
      char c=s.nextLine().charAt(0);//Read the character
      if(((c>='a')&&(c<='z'))||((c>='A')&&(c<='Z')))
        System.out.println(c +" is an alphabet");
      else
        System.out.println(c +" is not an alphabet");
    }
  }