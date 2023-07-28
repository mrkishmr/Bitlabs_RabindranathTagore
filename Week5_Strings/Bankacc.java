import java.util.*;

class Bankacc
  {
  public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter account no.");
      long acc=sc.nextLong();
      sc.nextLine();
      String acn=String.valueOf(acc);
      StringBuffer acno=new StringBuffer(acn);
      System.out.println("Enter the customer username");
      String cname=sc.nextLine();
      StringBuffer cn=new StringBuffer(cname);
      System.out.println("Enter IFSC Code");
      String ifsc=sc.nextLine();
      StringBuffer icode=new StringBuffer(ifsc);
      System.out.println("Your account number is "+acno);
      System.out.println("Customer name as per account is "+cn);
      System.out.println("IFSC Code is "+icode);
      System.out.println("Select either of the following options");
      System.out.println("1. To change account no");
      System.out.println("2. To change customer username");
      System.out.println("3. To change ifsc code");
      int opt=sc.nextInt();
      sc.nextLine();
      switch(opt)
        {
          case 1: System.out.println("Enter new account no");
                  long newacc=sc.nextLong();
                  String nac=String.valueOf(newacc);
                  System.out.println("The new account number is "+acno.replace(0,acno.length(),nac));
            break;
          case 2: System.out.println("Enter the new username");
                  String ncn=sc.nextLine();
            StringBuffer newname=new StringBuffer(cn.replace(0,cn.length(),ncn));
                  System.out.println("The new username is "+newname);
            break;
          case 3:System.out.println("Enter the new IFSC code");
                 String nic=sc.nextLine();
                 System.out.println("The new IFSC code is "+icode.replace(0, icode.length(),nic));
            break;
          default:
            System.out.println("Please enter a valid choice");
        }
      
    }
  }