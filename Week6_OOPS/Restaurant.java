//3. Restaurant: Create a class called "Dish" that represents a dish. The class should have properties such as name, ingredients, and price, and methods such as getName, getIngredients, and getPrice. Create another class called "Restaurant" that represents a restaurant. The class should have a list of dishes, and methods such as addDish, removeDish, and getTotalCost

import java.util.*;

class Dish
  {
    Scanner s=new Scanner(System.in);
    String name;
    int noofingredients;
    String ingredients[];
    int price;
    Dish()
    {
      System.out.println("Enter dish name");
      name=s.nextLine();
      System.out.println("Enter the number of ingredients");
      noofingredients=s.nextInt();
      s.nextLine();
      ingredients=new String[noofingredients];
      System.out.println("Enter the ingredients");
      for(int i=0;i<noofingredients;i++)
        {
          ingredients[i]=s.nextLine();
        }
      System.out.println("Enter the price of dish");
      price=s.nextInt();
    }
    void getName()
    {
      System.out.println("Dish: "+name);
    }
   void getIngredients()
    {
      System.out.println("Ingredients used for "+name+" are ");
      for(int i=0;i<noofingredients;i++)
        {
          System.out.println(ingredients[i]);
        }
    }
    void getPrice()
    {
      System.out.println("Price: "+price);
    }
  }

class Restaurant
  {
    public static void main(String ar[])
    {
      Dish d[]=new Dish[5];
      Restaurant rd=new Restaurant(); 
      for(int i=0;i<d.length;i++)
        {
          d[i]=new Dish();
        }
      System.out.println("Available dishes");
      for(int i=0;i<d.length;i++)
        {
          System.out.println(d[i].name);
        }
      rd.addDish();
    }
    void addDish()
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the dish to be added");
      Dish newdish=new Dish();
      newdish.name=s.nextLine();
    }
  }