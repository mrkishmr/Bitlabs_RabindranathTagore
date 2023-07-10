//Calculator App : create an application that takes a two values along with operator and find the value based on operator.

import java.util.*;

class Calculator
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter two numbers");
      int n1=s.nextInt();
      int n2=s.nextInt();
      System.out.println("Select an Operator");
      char op=s.next().charAt(1);
      switch(op)
        {
          case '+':
            {
              int sum=n1+n2;
              System.out.println("Result = "+sum);
              break;
            }
          case '-':
            {
              int diff=n2-n1;
              System.out.println("Result = "+diff);
              break;
            }
            case '*':
            {
              int product=n1*n2;
              System.out.println("Result = "+product);
              break;
            }
            case '/':
            {
              if(n1!=0)
              {
                int quotient=n2/n1;
              System.out.println("Result = "+quotient);
              }
              else
              {
                System.out.println("Divide by Zero not possible");
              }  
                break;
            }
          default:
            System.out.println("Invalid Operator!");
        }
    }
  }