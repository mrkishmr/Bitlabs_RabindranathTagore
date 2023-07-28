import java.util.*;

class Duplicateelement
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of array");
   int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter values of array");
    for (int p = 0; p < n; p++)
      a[p] = sc.nextInt();
    Duplicateelement t=new Duplicateelement();
    for (int i = 0; i < n; i++)
      System.out.println(" " + a[i]);
    t.method(a,n);
    for (int i=0;i<n-1; i++)
      System.out.println(" " + a[i]);
  }
void method(int b[], int m)
  {
    int k;
    System.out.println("Array before deleting element");
    for (k=0;k<m;k++)
      System.out.println(" " + b[k]);
    for (k=0; k<m-1;k++) 
    {
      int p = 0;
      for (int s = p + 1; s<m-1;s++) {
        if (b[k] == b[s]) 
        {
          for (int r=s;r<m;r++)
            b[r]=b[r + 1];
          m = m- 1;
        }
        System.out.println("Array after deleting element");
    for(k=0;k<m-1;k++)
      System.out.println(b[k]);
    }
  }
  }
  }