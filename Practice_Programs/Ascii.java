//Write a JAVA program to print all ASCII character with their values.

class Ascii
  {
    public static void main(String ar[])
    {
      int n=0;
      char ch=(char)n;
      for(int i=0;i<=255;i++)
        {
          System.out.println("The ASCII value of "+ch+" is "+n);
          n++;
        }
    }
  }