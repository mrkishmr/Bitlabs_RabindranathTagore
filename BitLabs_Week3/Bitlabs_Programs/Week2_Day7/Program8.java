//Program to input any character and check whether it is alphabet, digit or special character

import java.util.*;

public class Program8
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a character");
      char c=s.nextLine().charAt(0);//Read the character
      if(((c>='a')&&(c<='z'))||((c>='A')&&(c<='Z')))
        System.out.println(c +" is an alphabet");
      else if((c>='0')||(c<='9'))
        System.out.println(c +" is a number");
      else
        System.out.println(c +" is a special symbol");
    }
  }