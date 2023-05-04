import java.util.Scanner;//Import Scanner class

public class Program5
  {
    public static void main(String[] args)//main method declaration
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Your Name");
      String name=sc.nextLine();// Read the name
      System.out.println("Enter your age");
      int age=sc.nextInt();// Read the age
      System.out.println("Enter the aggregate percentage");
      float percent=sc.nextFloat();// Read the percentage 
      System.out.println("Name: " + name);
      System.out.println("Age: "+ age +" Years");
      System.out.println("Percentage aggregate: "+ percent +"%");
    }
  }