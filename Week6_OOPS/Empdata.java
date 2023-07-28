//Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
/*
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat*/

class Employee
  {
    String name;
    int year;
    String address;
    Employee()
    {
      this.name=name;
      this.year=year;
      this.address=address;
    }
    static void header()
    {
      System.out.println("Name"+'\t'+"Year of joining"+'\t'+"Address");
    }
    void displayName()
    {
      System.out.print(name+'\t');
    }
    void joinYear()
    {
      System.out.print(year);
    }
    void showAddr()
    {
      System.out.print('\t'+address+'\n');
    }
  }
class Empdata
  {
    public static void main(String ar[])
    {
      Employee e1=new Employee();
      Employee e2=new Employee();
      Employee e3=new Employee();
      Employee.header();
      e1.name="Robert";
      e1.year=1992;
      e1.address="64C, Walls Street";
      e1.displayName();
      e1.joinYear();
      e1.showAddr();
      e2.name="Sam";
      e2.year=2005;
      e2.address="65R, Walls Street";
      e2.displayName();
      e2.joinYear();
      e2.showAddr();
      e3.name="John";
      e3.year=1996;
      e3.address="28B, Walls Street";
      e3.displayName();
      e3.joinYear();
      e3.showAddr();
      
    }
  }