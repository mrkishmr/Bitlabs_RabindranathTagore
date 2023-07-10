class Boolop
  {
    public static void main(String ar[])
    {
        int a = 10;
        int b = 0;
        boolean result = (b != 0) && (a / b > 0); 
        System.out.println("Result: " + result);
        result = (b != 0) || (a / b > 0); 

System.out.println("Result: " + result);
    }
  }