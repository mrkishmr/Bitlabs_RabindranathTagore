//Write a JAVA program to print all odd number between 1 to 100.

class Even
  {
    public static void main(String ar[])
    {
      int i=1;
      while(i<=100)
        {
          if(i%2!=0)
          {
           System.out.println(i);
          }
          i--;
        }
    }
  }