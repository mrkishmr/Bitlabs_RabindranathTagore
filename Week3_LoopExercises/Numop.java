import java.util.*;

class Numbers
{
public static void main(String ar[])
{
  Scanner s=new Scanner(System.in);
System.out.println("1. Printing all number from 1 to n");
System.out.println("2. Printing all number from n to 1");
System.out.println("3. Printing even number and odd numbers from  1 to n");
System.out.println("4. Printing sum of all number  from 1 to n");
System.out.println("5. Printing sum of all even and odd number  from 1 to n");
System.out.println("enter your option in range of 1 to n");
int n=s.nextInt();

  Numbers nw=new Numbers();
do
{
System.out.println("enter your option in range of 1 to 5");
int option=s.nextInt();
switch(option)
{
case 1: nw.printNumber(n);
    break;
case 2: nw.printNumberReverse(n);
    break;
case 3: nw.printEvenOddNumber(n);
    break;
case 4: nw.printSumOfNumber(n);
    break;
case 5: nw.printSumOfEvenOddNumber(n);
    break;
default:
    System.out.println("wrong option");
    break;
}
  char ch=s.next().charAt(0);
System.out.println("do you want to continue (y/n)");
}
while(ch!='n');
}
void printNumber(int n)
{
  Scanner s=new Scanner(System.in);
    System.out.println("Enter the maximum value");
    int a=s.nextInt();
    int i=1;
  System.out.println("Printing all natural numbers from 1 to "+a);
    while(i<=a)
      {
        System.out.println(i);          
        i++;
      }
}
void printNumberReverse(int n)
{
  Scanner s=new Scanner(System.in);
    System.out.println("Enter the maximum value");
    int b=s.nextInt();
    int i=b;
    while(i>=1) 
      {
        System.out.println(i);
        i--;
      }
}
void printEvenOddNumber(int n)
{
  Scanner s=new Scanner(System.in);
  System.out.println("Enter max value for even and odd number range");
      int c=s.nextInt();
      System.out.println("Printing all even numbers:");
      for(int i=2;i<=c;i++)
        {
          if((i%2)==0)
          {
            System.out.println(i);
          }
        }
      System.out.println("Printing all odd numbers:");
      for(int j=1;j<=c;j++)
        {
          if((j%2)!=0)
          {
            System.out.println(j);
          }
        }
}
void printSumOfNumber(int n)
{
  Scanner s=new Scanner(System.in);
System.out.println("Enter the maximum value");
    int d=s.nextInt();
    int i=1;
    int sum=0;
  System.out.println("Printing all natural numbers from 1 to "+d);
    while(i<=d)
      {
        sum=sum+i;          
        i++;
      }
  System.out.println(sum);
}
void printSumOfEvenOddNumber(int n)
{
  Scanner s=new Scanner(System.in);
  System.out.println("Enter max value for even and odd number range");
      int e=s.nextInt();
      System.out.println("Printing sum of even numbers:");
      int evesum=0;
      for(int i=2;i<=e;i++)
        {
          if((i%2)==0)
          {
            evesum=evesum+i;
          }
        }
  System.out.println(evesum);
      System.out.println("Printing sum of odd numbers:");
      int oddsum=0;
      for(int j=1;j<=e;j++)
        {
          if((j%2)!=0)
          {
            oddsum=oddsum+j;
          }
        }
  System.out.println(oddsum);
 
}
}