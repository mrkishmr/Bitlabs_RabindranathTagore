//Write a java program to check whether a number is palindrome or not.

import java.util.*;

class Palindrome
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a number");
      int n=s.nextInt();
      int temp=n,rev_num=0;
      while(temp!=0)
        {
          int digit=temp%10;
          rev_num=(rev_num*10)+digit;
          temp=temp/10;
        }
      if(rev_num==n)
        System.out.println(n+" is a palindrome number");
      else
        System.out.println(n+" is not a palindrome number");
    }
  }