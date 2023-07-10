class Bitwise{
  public static void main(String arg[])
  {
    int a = 5; // Binary: 0101
    int b = 3; // Binary: 0011
    int And = a & b; 
    int Or = a | b; 
    int Xor = a ^ b; 
    int Complement = ~a; 
    System.out.println("Bitwise AND: " + And);
    System.out.println("Bitwise OR: " + Or);
    System.out.println("Bitwise XOR: " + Xor);
    System.out.println("Bitwise Complement: " + Complement);
  }
}