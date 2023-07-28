import java.util.*;

class Diagonal1
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter no of rows");
      int m=s.nextInt();
      System.out.println("Enter no of columns");
      int n=s.nextInt();
      System.out.println("Enter the elements");
      int a[][]=new int[m][n];
      for(int i=0;i<m;i++)
        {
          for(int j=0;j<n;j++)
            {
              a[i][j]=s.nextInt();
            }
        }
      System.out.println("The matrix is");
      for(int i=0;i<m;i++)
        {
          for(int j=0;j<n;j++)
            {
              System.out.print(a[i][j]+" ");
            }
          System.out.println();
        }
      if(m==n)
      {
        for(int i=0;i<m;i++)
        {
          for(int j=n-1;j>=0;j--)
            {
              if((i+j)==m-1)
              {
              System.out.println(a[i][j]);
              }
            }
        }
      }
    }
  }