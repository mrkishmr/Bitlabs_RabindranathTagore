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

class Interview extends Jobseeker {
  void interviewdate() {
    System.out.println(name + " your inetrview is at 30th July");
  }
}

class Employer extends Jobseeker{
   void checkDetails() {
    System.out.println("jobseeker name is " + name);
    System.out.println("jobseeker mobile no is " + mobileno);
    System.out.println("jobseeker eamil is " + email);
  }
}

class Hierarchy{
  public static void main(String p[]) {
    Employer e=new Employer(); 
    Interview i=new Interview();
    e.read(); 
    e.checkDetails();
    i.interviewdate();
  }
}