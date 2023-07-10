//Write a java program to print all even numbers and odd numbers  between 1 to 100. - using while loop

import java.util.*;

class Evenodd
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter max value for even and odd number range");
      int n=s.nextInt();
      System.out.println("Printing all even numbers:");
      for(int i=2;i<=n;i++)
        {
          if((i%2)==0)
          {
            System.out.println(i);
          }
        }
      System.out.println("Printing all odd numbers:");
      for(int j=1;j<=n;j++)
        {
          if((j%2)!=0)
          {
            System.out.println(j);
          }
        }
    }
  }