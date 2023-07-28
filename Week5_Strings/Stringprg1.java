//Creating string using string literal and string class

import java.util.*;

class Stringprg1
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      //Giving static data
      /*String s1="Hello";
      String s2=new String("Hi");
      System.out.println(s1);
      System.out.println(s2);*/
      //Giving dynamic data
      System.out.println("Enter 1st String");
      String g1=new String();
      g1=sc.nextLine();
      System.out.println(g1);
      /*for(int i=0;i<g1.length();i++)//getting individual characters in a string
        {
          System.out.println(g1.charAt(i));
        }*/
      System.out.println("Enter second string");
      String g2=new String();
      g2=sc.nextLine();
      System.out.println(g2);
      String b[]=g1.split(" ");//retreiving the words in a string
      for(int j=0;j<b.length;j++)
        {
          System.out.println(b[j]);//prints the words of the string
        }
      System.out.println("The number of individual characters in string are "+g1.length());
      System.out.println("The number of words in the string are "+b.length);
      System.out.println(g1.concat(" hi"));//string concatenation using concat method
      System.out.println(g1+" hi");//string concatenation using + operator
      System.out.println(g1.charAt(0));//getting a character from a string
      //Display characters in string using array operator
      char b2[]=g1.toCharArray();
      System.out.println(Arrays.toString(b2));
      //String comparison
      System.out.println(g1.compareTo(g2));
      System.out.println(g2.compareTo(g1));
      //Equality operator
      /*System.out.println(g1==g2);
      String g3="good";
      String g4="good";
      System.out.println(g3==g4);*/
      //equals method
      System.out.println(g1.equals(g2));
      //equalsIgnoreCase method
      System.out.println(g1.equalsIgnoreCase(g2));
      //startsWith method
      System.out.println(g1.startsWith("h"));
      //endsWith method
      System.out.println(g2.endsWith("o"));
      //indexOf method
      System.out.println(g1.indexOf("n"));
      System.out.println(g1.indexOf("g",4));
      //lastIndexOf method
      System.out.println(g1.lastIndexOf("n"));
      System.out.println(g1.lastIndexOf("g",4));
      //contains method
      System.out.println(g1.contains("od"));
      //substring method
      System.out.println(g1.substring(3, 9));
      System.out.println(g1.substring(4));
      //replace method
      System.out.println(g1.replace("good", "new"));
      //trim method
      System.out.println(g1.trim());
    }
  }