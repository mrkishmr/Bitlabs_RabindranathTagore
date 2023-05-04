// Program to find the area of a rectangle

import java.util.Scanner; //Import Scanner Class

public class Program2
{
  public static void main(String[] args) //main method 
  {
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter the length and breadth");
    int l=sc.nextInt();//Read the value of length
    int b=sc.nextInt();//Read the value of breadth
    int area=l*b;//Find the area of the rectangle using formula area=length*breadth
    System.out.println("The area of the recangle is " + area);// Display the area of the rectangle
  } 
}