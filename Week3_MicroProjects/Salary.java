//Employee Salary Calculator: Create an application that takes an employee's salary and calculates their annual salary, tax and net salary. Use conditional statements to determine the tax bracket and calculate the tax accordingly

import java.util.*;

class Salary
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the employee salary");
      int salary=s.nextInt();
      int annual=salary*12;
      float tax;
      System.out.println("Annual salary of the employee is "+annual);
      if(annual<=700000)
      {
        tax=0.0f;
      }
      else if(annual<=900000)
      {
        tax=((5*300000)/100.0f)+((10*300000)/100.0f)+((15*(900000-annual))/100.0f);
      }
      else if(annual<=1200000)
      {
        tax=((5*300000)/100.0f)+((10*300000)/100.0f)+((15*300000)/100.0f)+((20*(1200000-annual))/100.0f);
      }
      else
      {
        tax=((5*300000)/100.0f)+((10*300000)/100.0f)+((15*300000)/100.0f)+((20*300000)/100.0f)+((30*(annual-1200000))/100.0f);
      }
      System.out.println("Tax applicable for the given salary is "+tax);
    float net_salary=annual-tax;
      System.out.println("The net salary of the employee is "+net_salary);
    }
  }