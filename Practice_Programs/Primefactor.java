//Write a JAVA program to find all prime factors of a number.

//Write a JAVA program to check whether a number is Prime number or not.

import java.util.*;

class Primefactor
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number to get its prime factors");
      int n=sc.nextInt();
      System.out.println("The prime factors of "+n+" are");
      for(int i=2;i<=n;i++)
        {
          while (n%i==0) 
          {
                System.out.println(i);
                n=n/i;
          }
        }
    }
  }