//Create class with name cricket having player name, match name, no of players, Use the properties of this class in T20Match, TestMatch and OneDayMatch classes and display details of all matches 

import java.util.*;

class Crick
  {
    Scanner s=new Scanner(System.in);
    String playername;
    String matchname;
    int noofplayers;
    Crick()
    {
      System.out.println("Enter the player name");
      playername=s.nextLine();
      System.out.println("Enter the match name");
      matchname=s.nextLine();
      System.out.println("Enter the number of players");
      noofplayers=s.nextInt();
    }
  }

class T20 extends Crick
  {
    void T20Match()
    {
      System.out.println("Player name "+playername);
      System.out.println("Match name "+matchname);
      System.out.println("Number of players "+noofplayers);
    }
  }
class Testmatch extends Crick
  {
    void testMatch()
    {
      System.out.println("Player name "+playername);
      System.out.println("Match name "+matchname);
      System.out.println("Number of players "+noofplayers);
    }
  }
class Oneday extends Crick
  {
    void oneDay()
    {
      System.out.println("Player name "+playername);
      System.out.println("Match name "+matchname);
      System.out.println("Number of players "+noofplayers);
    }
  }
class Cricket
  {
    public static void main(String ar[])
    {
      T20 t=new T20();
      Testmatch ts=new Testmatch();
      Oneday o=new Oneday();
      t.T20Match();
      ts.testMatch();
      o.oneDay();
    }
  }