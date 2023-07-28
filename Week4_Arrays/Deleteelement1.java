import java.util.*;

class Deleteelement1 
{
  public static void main(String[] args)
 {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    n = sc.nextInt();
    int array[] = new int[n];
    System.out.println("Enter values of array");
    for (int p = 0; p < n; p++)
      array[p] = sc.nextInt();
    Deleteelement1 t=new Deleteelement1();
    for (int i = 0; i < n; i++)
      System.out.println(" " + array[i]);
    t.method(array,n);
    for (int i = 0; i < n-1; i++)
      System.out.printl(" " + array[i]);
  }
void method(int k[], int m)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the index to delete element");
      int index=sc.nextInt();
    System.out.println("Array after deleting element");
    if((index>=0)&&(index<m))
    {
    for(int v=index;v<m-1;v++)
      {
              k[v]=k[v+1];
      }
     for(int v=0;v<m-1;v++)
     {
         System.out.println(k[v]);
     }
    }
  }
  }

 