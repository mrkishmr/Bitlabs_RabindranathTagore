//Write a java program to find the maximum occurring character in a given String

import java.util.*;

class Mostchar
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a string");
      String s1=sc.nextLine();
      char b[]=s1.toCharArray();
      //int c[]=new int[b.length];
      char most=b[0];
      int max=0;
      for(int i=0;i<b.length;i++)
        {
          int count=1;
          for(int j=i+1;j<b.length;j++)
            {
              if(b[i]==b[j])
              {
                count++;
              }
            }
          if(count>max)
          {
            max=count;
            most=b[i];
          }
        }
      System.out.println("The most occuring character is "+most);
    }
  }