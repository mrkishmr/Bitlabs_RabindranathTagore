//Write a java program to print all natural numbers from 1 to n. - using while loop
import java.util.*;

class Natno
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the maximum value");
      int n=s.nextInt();
      int i=1;
      while(i<=n)
        {
          System.out.println(i);
          i++;
        }
    }
  }