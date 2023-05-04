import java.util.Scanner;

class Program1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("The value of a+b is " + (a+b));
    System.out.println("The value of a-b is " + (a-b));
    System.out.println("The value of a*b is " + (a*b));
    System.out.println("The value of a/b is " + (a/b));
	}
}
