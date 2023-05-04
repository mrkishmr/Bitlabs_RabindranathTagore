// Program to calculate the Simple Interest

import java.util.Scanner;// Import Scanner Class

public class Program3
{
  public static void main(String[] args)//main method
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the principal amount");
    int p=sc.nextInt();//Read the principal amount
    System.out.println("Enter the time period");
    int t=sc.nextInt();//Read the time period
    System.out.println("Enter the rate of interest per annum");
    int r=sc.nextInt();//Read the rate of interest
    float interest=(p*t*r)/100;//Calculate the simple interest for the amount
    System.out.println("The simple interest for the amount is " + interest);
  } 
}