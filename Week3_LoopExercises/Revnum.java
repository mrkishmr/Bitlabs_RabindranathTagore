//Write a java program to enter a number and print its reverse.

import java.util.*;

class Revnum
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
        System.out.println(rev_num);
    }
  }