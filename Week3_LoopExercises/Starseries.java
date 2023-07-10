import java.util.*;

class Starseries
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter no of rows to print");
      int row=s.nextInt();
      for (int r = 1; r <= row; r++)
      {
        for (int i = 1; i <= row - r; i++) // is for didsplayimg spaces     
        System.out.print(" " + " ");
      for (int j = row - r + 1; j <= row; j++)// disdplaying *
        System.out.print(" " + "*");
      System.out.println();
      }
    }
  }