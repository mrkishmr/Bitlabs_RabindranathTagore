//Write a java program to print the series 5, 25, 125, 725,.....n

import java.util.*;

class Fordemo
  {
    public static void main(String ar[])
    {
      Scanner mk=new Scanner(System.in);
      System.out.println("Enter the max value to print the series");
      int n=mk.nextInt();
      {
      for(int k=5;k<=n;k*=5)
        {
          if(k>725)
        System.out.println(k);
        }
      }
    }
  }