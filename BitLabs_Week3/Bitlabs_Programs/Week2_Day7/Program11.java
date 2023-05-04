//Program to input basic salary of an employee and calculate its Gross salary by adding DA and HRA to the Basic salary
/*  Basic Salary <= 10000 : HRA = 20%, DA = 80%
    Basic Salary <= 20000 : HRA = 25%, DA = 90%
    Basic Salary > 20000 : HRA = 30%, DA = 95% 
*/

import java.util.*;

public class Program11
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      int basic,DA,HRA,gross_salary;
      System.out.println("Enter the basic salary of the employee");
      basic=s.nextInt();
      if(basic<=10000)
      {
        DA=(80*basic)/100;
        HRA=(20*basic)/100;
      }
      else if(basic<=20000)
      {
        DA=(90*basic)/100;
        HRA=(25*basic)/100;
      }
      else
      {
        DA=(95*basic)/100;
        HRA=(30*basic)/100;
      }
      gross_salary=basic+DA+HRA;
      System.out.println("The gross salary for the calculated basic salary is "+ gross_salary);
    }
  }