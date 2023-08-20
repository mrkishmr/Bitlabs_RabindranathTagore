//Write a JAVA program to check whether a number is Prime number or not.

import java.util.*;

class Primeno
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int n=sc.nextInt();
      boolean prime=false;
      for(int i=2;i<n;i++)
        {
          if(n%i==0)
          {
            prime=true;
          }
        }
      if(prime)
      {
        System.out.println(n+" is not a prime number");
      }
      else
      {
        System.out.println(n+" is a prime number");
      }
    }
  }