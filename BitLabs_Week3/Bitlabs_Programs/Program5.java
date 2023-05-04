// Temperature Converter: Create an application that takes a temperature in Celsius or Fahrenheit as input and converts it to the other unit. Use conditional statements to determine whether to convert from Celsius to Fahrenheit or vice versa.

import java.util.*;

public class Program5
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Select either of two options to determine temperature");
      System.out.println("1. Celsius to Farenheit");
      System.out.println("2. Farenheit to celsius");
      int ch=sc.nextInt();
      switch(ch)
        {
          case 1:
            {
              System.out.println("Enter the temperature in Celsius");
            float celsius=sc.nextFloat();
            float farenheit=(((9/5)*celsius)+32);
            System.out.println("The temperature in farenheit is " + farenheit);
              break;
            }
          case 2:
            {
              System.out.println("Enter the temperature in farenheit");
            float farenheit=sc.nextFloat();
            float celsius=(farenheit-32*(5/9));
            System.out.println("The temperature in celsius is " + celsius);
              break;
            }
              default :
                System.out.println("Please enter the correct choice");
            
        }
    }
  }