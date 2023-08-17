/*Write a JAVA program to input basic salary of an employee and calculate its Gross salary according to following:

BasicSalary <= 10000 : HRA = 20%, DA = 80%
BasicSalary <= 20000 : HRA = 25%, DA = 90%
BasicSalary > 20000 : HRA = 30%, DA = 95% */

import java.util.*;

class Salary 
{
    public static void main(String ar[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the basic salary: ");
        float basic=sc.nextFloat();
        float HRA,DA;
        if (basic<=10000)
        {
            HRA = 0.2f*basic;
            DA = 0.8f*basic;
        } 
        else if (basic<=20000) 
        {
            HRA = 0.25f*basic;
            DA = 0.9f*basic;
        } 
        else 
        {
            HRA = 0.3f*basic;
            DA = 0.95f*basic;
        }
        float gross = basic+HRA+DA;
        System.out.println("Basic Salary: " +basic);
        System.out.println("HRA: " + HRA);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " +gross);
    }
}
