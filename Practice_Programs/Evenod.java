//5. Write a JAVA program to check whether a number is even or odd

import java.util.*;

class Evenod
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int n=sc.nextInt();
      if(n%2==0)
        System.out.println(n+" is an even number");
      else
        System.out.println(n+" is not an even number");
    }
  }