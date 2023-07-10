//Write a java program to find maximum between two numbers.
import java.util.*;

class Threelarge
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter n1 value: ");
      int n1=s.nextInt();
      System.out.println("Enter n2 value: ");
      int n2=s.nextInt();
      System.out.println("Enter n3 value: ");
      int n3=s.nextInt();
      if((n1>n2)&&(n1>n3))
        System.out.println(n1+" is greater");
      else if((n2>n1)&&(n2>n3))
        System.out.println(n2+" is greater");
      else
        System.out.println(n3+" is greater");
    }
  }