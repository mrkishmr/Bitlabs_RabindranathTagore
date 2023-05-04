import java.util.Scanner;// Import Scanner Class

public class Program4
{
  public static void main(String[] args)//main method
  {
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter the first number");
    int a=sc.nextInt();
    System.out.println("Enter the second number");
    int b=sc.nextInt();
    System.out.println("Before swapping, the value of a is "+ a);
    System.out.println("Before swapping, the value of b is "+ b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After swapping, the value of a is "+ a);
    System.out.println("After swapping, the value of b is "+ b);
    
    
  }
}