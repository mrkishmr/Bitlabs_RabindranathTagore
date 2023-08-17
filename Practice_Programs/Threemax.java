//2. Write a JAVA program to find maximum between three numbers.

import java.util.*;

class Threemax
  {
    public static void main(String ar[])
    {
      int a,b,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the three numbers");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      if(a>b&&a>c)
        System.out.println(a+" is greater");
      else if(b>a&&b>c)
        System.out.println(b+" is greater");
      else
        System.out.println(c+" is greater");
    }
  }