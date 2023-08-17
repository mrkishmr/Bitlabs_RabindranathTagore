// Write a JAVA program to find sum of first and last digit of a number. 

import java.util.*;

class Firstlastsum
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
      System.out.println("The sum of first and last digit of "+n+" is "+(firstdigit+lastdigit));
    }
  }