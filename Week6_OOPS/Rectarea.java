//Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

import java.util.*;

class Area
  {
    Scanner sc=new Scanner(System.in);
    int l,b;
    Area()
    {
      System.out.println("Enter the length");
      l=sc.nextInt();
      System.out.println("Enter the breadth");
      b=sc.nextInt();
    }
    void returnArea()
    {
      int area=l*b;
      System.out.println("The area of the rectangle is "+area);
    }
  }

class Rectarea
  {
    public static void main(String ar[])
    {
      Area a=new Area();
      a.returnArea();
    }
  }