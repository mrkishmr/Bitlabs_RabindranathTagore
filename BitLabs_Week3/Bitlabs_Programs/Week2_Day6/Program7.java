// program to illustrate ternary, increment/decrement and assignment operator

import java.util.Scanner;//import scanner class

public class Program7{
  public static void main(String[] args)//main method
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 1st value");
    int a=sc.nextInt();// Read the first value
    System.out.println("Enter the 2nd value");
    int b=sc.nextInt();// Read the second value
    int z=(a>b)?a:b;//Ternary operator
    System.out.println("The result for conditional operator is " + z);
    int m=a++;//Post increment
    System.out.println("Post increment result is "+ m +"and value of a is "+ a);
    int n=++a;//Pre increment
    System.out.println("Pre increment result is "+ n);
    int x=b--;//Post decrement
    System.out.println("Post decrement result is "+ x +"and value of b is "+ b);
    int y=--b;//Pre decrement
    System.out.println("Pre decrement result is "+ y);
    a*=5;//Assignment operator
    System.out.println("Value of a after assignment operation is"+ a);
    
    
  }
}