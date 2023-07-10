import java.util.Scanner;
 
class Quadartic {
  public static void main(String j[]) {
    double a, b, c;
 
    System.out.println("Enter values for a,b and c");
    Scanner v = new Scanner(System.in);
    a = v.nextDouble();
    b = v.nextDouble();
    c = v.nextDouble();
    Quadratic q = new Quadratic();
    q.findRoots(a, b, c);
    // it r= q.findRoots(a,b,c); not needed
  }
 
  void findRoots(double a, double b, double c) {
    double root1, root2;
    if ((b * b) > (4 * a * c) && (a > 0)) {
      root1 = (-b) + Math.sqrt((b * b) - (4 * a * c)) / (2 * a);
      root2 = (-b) - Math.sqrt((b * b) - (4 * a * c)) / (2 * a);
      System.out.println("Root1 value is" + root1);
      System.out.println("Root1 value is" + root2);
    } 
    else {
      System.out.println("roots are imaginary");
    }
 
  }
 
}