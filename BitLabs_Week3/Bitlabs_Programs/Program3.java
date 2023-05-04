// Program to decide winner for rock paper and scissors game
//1. Rock 2. Paper 3. Scissor

import java.util.*;

public class Program3
  {
    public static void main(String[] ar)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter player 1 move");
      int p1=sc.nextInt();
      System.out.println("Enter player 2 move");
      int p2=sc.nextInt();
      if(p1==p2)
      {
        System.out.println("The game is a draw match");
      }
      else if(((p1==1)&&(p2==2))||((p1==2)&&(p2==1)))
      {
        if(p1>p2)
        {
          System.out.println("Player 1 wins and the move made is paper");
        }
        else
        {
          System.out.println("Player 2 wins and the move made is paper");
        }
        
      }
      else if(((p1==2)&&(p2==3))||((p1==3)&&(p2==2)))
      {
        if(p1>p2)
        {
          System.out.println("Player 1 wins and the move made is scissor");
        }
        else
        {
          System.out.println("Player 2 wins and the move made is scissor");
        }
      }
      else if(((p1==1)&&(p2==3))||((p1==3)&&(p2==1)))
      {
        if(p1>p2)
        {
          System.out.println("Player 1 wins and the move made is rock");
        }
        else
        {
          System.out.println("Player 2 wins and the move made is rock");
        }
      }
      
    }
  }