import java.util.*;

class Jobseeker {
  String name;
  long mobileno;
  String email;
  private int securitycode;
  void read() {
    Scanner s = new Scanner(System.in);
    System.out.println("enter candidate name, Mobile no, email");
    name = s.next();
    mobileno = s.nextLong();
    email = s.next();
  }
  }

class Employeer extends Jobseeker {
  void interviewdate() {
    System.out.println(name + " your inetrview is at 30th July");
  }
}

class Interview extends Employeer{
   void checkDeatils() {
    System.out.println("jobseeker name is " + name);
    System.out.println("jobseeker mobile no is " + mobileno);
    System.out.println("jobseeker eamil is " + email);
  }
}

class Multilevelinheritance {
  public static void main(String p[]) {
    Interview i=new Interview();    
    i.read();  
    i.interviewdate();
    i.checkDeatils();
  }
}