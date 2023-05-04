//Program to check whether a character is a vovel or consonant

import java.util.*;

public class Program7
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a character");
      char c=s.nextLine().charAt(0);//Read the character
      if(((c>='a')&&(c<='z'))||((c>='A')&&(c<='Z')))
      {
        System.out.println(c +" is an alphabet");
        {
          if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U'))
          {
            System.out.println(c +" is a vowel");
          }
          else
          {
            System.out.println(c +" is a consonant");
          }
          }
        }
      else
    {  
        System.out.println(c +" is not an alphabet");
    }
  }
}