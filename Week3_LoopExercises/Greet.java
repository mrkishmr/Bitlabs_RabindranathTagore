//Write a program that asks the user for their name and prints a personalized greeting message. Repeat this process five times using a loop

import java.util.*;

class Greet
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter your name");
      String name=s.nextLine();
      for(int i=1;i<=5;i++)
        {
          System.out.println("Good morning "+name);
        }
    }
  }