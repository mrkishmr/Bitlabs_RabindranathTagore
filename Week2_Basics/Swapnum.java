//Write the java program to swap any two numbers

class Swapnum
  {
    public static void main(String ar[])
    {
      int a=10;
      int b=20;
      System.out.println("Before swapping, value of a is "+a);
      System.out.println("Before swapping, value of b is "+b);
      int temp=a;
      a=b;
      b=temp;
      System.out.println("After swapping, value of a is "+a);
      System.out.println("After swapping, value of b is "+b);
    }
  }