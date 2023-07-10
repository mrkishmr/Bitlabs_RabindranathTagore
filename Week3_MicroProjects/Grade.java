// 3. Grade Calculator: Create an application that takes a student's test scores and calculates their final grade. Use conditional statements to determine the letter grade (e.g. A, B, C, etc.) based on their scores
import java.util.Scanner;

class Grade {
  public static void main(String ar[]) 
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the marks of student secured in all five subjects, subject score must be in the range 0-100");
    System.out.println("Enter English Score");
    int s1=s.nextInt();
    System.out.println("Enter Mathematics Score");
    int s2=s.nextInt();
    System.out.println("Enter Science Score");
    int s3=s.nextInt();
    System.out.println("Enter Social Studies Score");
    int s4=s.nextInt();
    System.out.println("Enter Computer Science Score");
    int s5=s.nextInt();
    float percent=(s1+s2+s3+s4+s5)/5;
    System.out.println("Overall percentage secured: "+percent);
    if(percent>=90)
      System.out.println("Grade secured: A");
    else if(percent>=70)
      System.out.println("Grade secured: B");
    else if(percent>=50)
      System.out.println("Grade secured: C");
    else if(percent>=40)
      System.out.println("Grade secured: D");
    else
      System.out.println("Grade secured: F");
  }
}