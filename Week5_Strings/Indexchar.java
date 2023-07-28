//Write a Java program to get the character at the given index within the String

import java.util.*;

class Indexchar
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String s1=new String();
      s1=sc.nextLine();
      System.out.println("Enter the index number from which you want to extract the character");
      int k=sc.nextInt();
      char c[]=s1.toCharArray();
      for(int i=0;i<c.length;i++)
        {
          if(i==k)
          {
            System.out.println("The character at index "+k+" is "+c[i]);
            break;
          }
        }
    }
  }