import java.util.*;

class Series 
{
  public static void main(String p[]) 
  {
    int row;
    Scanner t = new Scanner(System.in);
    System.out.println("Enter no of rows to display pattern");
    row = t.nextInt();
    Series s = new Series();
    s.pattern(row);
  }
  void pattern(int row) 
  {
    for (int r = 1; r <= row; r++) 
    {
      int col = r;
      for (int c = 1; c <= col; c++) 
      {
        System.out.print(c + " ");
      }
      System.out.println();
    }
  }
}
