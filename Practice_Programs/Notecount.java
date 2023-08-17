//Write a JAVA program to count total number of notes in given amount.

import java.util.*;
 
class Notecount
{
  public static void main(String ar[])
  {
    int amount;
    System.out.println("Enter the amount");
    Scanner sc=new Scanner(System.in);
    amount=sc.nextInt();
    Notecount nc=new Notecount();
    int result=nc.findNoofNotes(amount);
    System.out.println("No of notes in" + amount + "=" + result);
  }
  int findNoofNotes(int amount)
  {
    int note2000 = 0, note500 = 0, note200 = 0, note100 = 0, note50 = 0, note20 = 0, note10 = 0, note5 = 0, note2 = 0,
        note1 = 0;
    int noofnotes;
    while (amount > 0)
      {
      if (amount >= 2000) 
      {
        note2000 = amount / 2000;
        amount = amount % 2000;
      } 
      else if (amount >= 500) 
      {
        note500 = amount / 500;
        amount = amount % 500;
      } 
      else if (amount >= 200) 
      {
        note200 = amount / 200;
        amount = amount % 200;
      } 
      else if (amount >= 100) 
      {
        note100 = amount / 100;
        amount = amount % 100;
      } 
      else if (amount >= 50)
      {
        note50 = amount / 50;
        amount = amount % 50;
      } 
      else if (amount >= 20) 
      {
        note20 = amount / 20;
        amount = amount % 20;
      } 
      else if (amount >= 10) 
      {
        note10 = amount / 10;
        amount = amount % 10;
      } 
      else if (amount >= 5) 
      {
        note5 = amount / 5;
        amount = amount % 5;
      }
      else if (amount >= 2) 
      {
        note2 = amount / 2;
        amount = amount % 2;
      } 
      else 
      {
        note1 = amount / 1;
        amount = amount % 1;
      }
    }
    noofnotes = note2000 + note500 + note200 + note100 + note50 + note20 + note10 + note5 + note2 + note1;
    return noofnotes;
  }
 