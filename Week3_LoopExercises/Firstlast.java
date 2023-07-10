//Write a java program to find the first and last digits of a number

import java.util.*;

class Firstlast
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a number");
      int n=s.nextInt();
      int lastdigit=n%10,firstdigit=0;
      int temp=n;
      while(temp>0)
        {
          firstdigit=temp%10;
          temp=temp/10;
        }
      System.out.println("The first and last digit of "+n+" is "+firstdigit+" and "+lastdigit);
    }
  }