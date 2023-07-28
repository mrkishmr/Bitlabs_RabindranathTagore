//ATM Simulator: Create a class called "Account" that represents a bank account. The class should have properties such as account number, balance, and account holder name, and methods such as deposit, withdraw and check balance. Create another class called "ATMSimulator" that represents an ATM machine. The class should have a list of accounts, and methods such as addAccount, removeAccount, and transact

import java.util.*;

class Atmsim
  {
    long Accountno;
    String name=new String();
    private int balance;
    static int ifcode;
    void deposit()
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the amount to deposit");
      int deposit=s.nextInt();
      System.out.println("The amount deposited is "+deposit);
    }
    void checkbalance()
    {
      balance=2000;
      System.out.println("The balace available in the account is "+balance);
    }
    static void ifsc()
    {
      ifcode=3043;
      System.out.println("The ifsc code is "+ifcode);
    }
  }
class Account
{
  public static void main(String ar[])
  {
    Atmsim ac=new Atmsim();
    Atmsim.ifsc();
    ac.checkbalance();
    ac.deposit();
  }
}