//3. Write a JAVA program to check whether a number is negative, positive or zero.

import java.util.*;

class Posneg
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a number");
      int a=s.nextInt();
      if(a>0)
        System.out.println(a+" is a positive integer");
      else if(a<0)
        System.out.println(a+" is a negative integer");
      else
        System.out.println("a is equal to 0");
    }
  }