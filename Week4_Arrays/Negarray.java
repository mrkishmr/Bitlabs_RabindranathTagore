import java.util.*;

class Negarray
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      Negarray neg=new Negarray();
      System.out.println("Declare the array size");
      int n=sc.nextInt();
      System.out.println("Enter the array elements");
      int a[]=new int[n];
      int i;
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Array elements before modification");
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
      neg.validate(a);
      System.out.println("Array elements after modification");
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
    }
    void validate(int b[])
    {
     for(int i=0;i<b.length;i++)
       {
         if(b[i]<0)
         {
           b[i]=0;
         }
       }
    }
  }