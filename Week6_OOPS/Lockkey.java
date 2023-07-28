import java.util.*;

class Keylock
  {
    String address=new String();
    private int key;
    static int pincode;
    void showAddress()
    {
      System.out.println("Delivered to the address: "+address);
    }
    static void pincode()
    {
      pincode=56034;
      System.out.println("The pincode of the area is "+pincode);
    }
    void openClose()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the key to open/close");
      key=sc.nextInt();
      System.out.println("Lock opened/closed with key "+key);
    }
  }
public class Lockkey
  {
    public static void main(String ar[])
    {
      Scanner s=new Scanner(System.in);
      Keylock home1=new Keylock();
      Keylock home2=new Keylock();
      home1.address="No 7, 7th main, ABC Layout";
      home2.address="No 8, 7th main, ABC Layout";
      home1.showAddress();
      Keylock.pincode();
      home1.openClose();
      home2.showAddress();
      Keylock.pincode();
      home2.openClose();
    }
  }