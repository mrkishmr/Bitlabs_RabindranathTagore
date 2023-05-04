//Program to Read a number and print the weekday

import java.util.*;

public class Program2
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the week code");
      int num=s.nextInt();
      switch(num)
        {
          case 1:
            {
               System.out.println("Day is Sunday");
              break;
            }
          case 2:
            {
               System.out.println("Day is Monday");
              break;
            }
          case 3:
            {
               System.out.println("Day is Tuesday");
              break;
            }
          case 4:
            {
               System.out.println("Day is Wednesday");
              break;
            }
          case 5:
            {
               System.out.println("Day is Thursday");
              break;
            }
          case 6:
            {
               System.out.println("Day is Friday");
              break;
            }
          case 7:
            {
               System.out.println("Day is Saturday");
              break;
            }
          default:
            {
               System.out.println("Please enter correct number");
              break;
            }
        }
    }
  }