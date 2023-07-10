// Temperature Converter: Create an application that takes a temperature in Celsius or Fahrenheit as input and converts it to the other unit. Use conditional statements to determine whether to convert from Celsius to Fahrenheit or vice versa.
import java.util.*;

class Temp
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Choose Option 1 for Farenheit to celsius conversion");
      System.out.println("Choose Option 2 for Celsius to farenheit conversion");
      int ch=s.nextInt();
      if((ch!=1)&&(ch!=2))
         {
            System.out.println("Invalid Input! Please enter a valid choice");
         }
      else
      {
        if(ch==1)
        {
          System.out.println("Enter Temperature in farenheit");
          float far=s.nextFloat();
          float cel=(far-32.0f)*(5.0f/9.0f);
          System.out.println(far+" degrees in farenheit is equivalent to "+cel+" degrees in celsius");
        }
        else
        {
          System.out.println("Enter temperature in celsius");
          float cel=s.nextFloat();
          float far=(cel*(9.0f/5.0f))+32.0f;
          System.out.println(cel+" degrees in celsius is equivalent to "+far+" degrees in farenheit");
        }
      }
    }
  }