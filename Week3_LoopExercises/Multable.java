//	Write a java program to count number of digits in a number.

import java.util.*;

class Multable
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the number to display its multiplication table");
      int n=s.nextInt();
      for(int i=1;i<=10;i++)
        {
          System.out.println(n+"*"+i+"="+(n*i));
        }
    }
  }