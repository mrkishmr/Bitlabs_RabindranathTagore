// Create an application that generates a specified number of prime numbers in the given range

import java.util.Scanner;

class Primerange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the start range:");
        int n1 = s.nextInt();
        System.out.println("Enter the end range:");
        int n2 = s.nextInt();
        System.out.println("Prime numbers between "+n1+" and "+n2+" are:");
        for (int i=n1;i<=n2;i++)
          {
            boolean temp = true;
            if (i<=1) 
            {
                temp = false;
            } 
            else 
            {
                for (int j=2; j<=i/2;j++) 
                {
                    if (i%j == 0) 
                    {
                        temp = false;
                        break;
                    }
                }
            }

            if (temp) 
            {
                System.out.println(i);
            }
        }
    }
}
