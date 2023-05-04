//Program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer and calculate the percentage.
//Print the grade based on the percentage

import java.util.*;//Import scanner class

public class Program10
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter Physics marks");
      int p=s.nextInt();
      System.out.println("Enter Chemistry marks");
      int c=s.nextInt();
      System.out.println("Enter Mathematics marks");
      int m=s.nextInt();
      System.out.println("Enter Biology marks");
      int b=s.nextInt();
      System.out.println("Enter Computer Science marks");
      int cs=s.nextInt();
      int total=p+c+m+b+cs;
      float percent=total/5;
      System.out.println("Percentage Obtained: "+ percent);
      if(percent>90)
        System.out.println("Grade Obtained: A");
      else if(percent>70)
        System.out.println("Grade Obtained: B");
      else if(percent>50)
        System.out.println("Grade Obtained: C");
      else if(percent>40)
        System.out.println("Grade Obtained: D");
      else
        System.out.println("Grade Obtained: F");
      
    }
  }