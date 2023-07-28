import java.util.*;

class Employee
{
  String name; 
int year;
double salary;
String address;
Employee()
{
    Scanner s=new Scanner(System.in);
    System.out.println("enter employee name");
    name=s.nextLine();
    System.out.println("enter year");
    year=s.nextInt();
    System.out.println("enter employee salary");
    salary=s.nextDouble();
    System.out.println("enter Address");
    address=s.nextLine();
}
  void display() 
    {
        System.out.print(name+'\t');
       System.out.println(year);
    System.out.println(salary);
    System.out.println('\t'+address+'\n');
      }
  static void header()
  {
    System.out.println("Name"+'\t'+"Year"+'\t'+"Salary"+'\t'+"Address"+'\n');
  }
}
class Empdb 
  {
  public static void main(String args[])
    {
Scanner s=new Scanner(System.in);
System.out.println("enter number of empolyees");
int n=s.nextInt();
Employee e[]=new Employee[n];  // array of objects of type empolyee 
for(int i=0;i<e.length;i++)
{
e[i]=new Employee();  
}
Employee.header();
for(int i=0;i<e.length;i++)
  {
    e[i].display();
  }
//
}
}


