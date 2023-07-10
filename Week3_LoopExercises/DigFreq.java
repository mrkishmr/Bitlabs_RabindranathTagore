import java.util.*;

class DigFreq
{
  public static void main(String p[]) 
  {
    // 1. give any no as input
    int number;// varaible declartion
    Scanner t = new Scanner(System.in);
    System.out.println("enter any number");
    number = t.nextInt();
    // 2. Store digits in an array
    // 2.1 take an array and allocate memory for it
    // 567---> 3cells 789985---> 6 cells
    // 2.2 fisrt know how many digits are there in the number
    int temp = number;
    int noofdigits = 0;
    while (temp > 0) 
    {
      noofdigits = noofdigits + 1;
      temp = temp / 10;
    }
    // 2.1 take an array and allocate memory
    int digits[] = new int[noofdigits];
    // this allocate memory
    // 2.3 store individual digits in array dgits[]
    int r=noofdigits-1;
    while (number > 0) 
    {
        digits[r] = number % 10;
      // placing digits from last cell to first cell
      number = number / 10;
      r=r-1;
    }
    for (int i = 0; i < noofdigits; i++)
      System.out.println(digits[i]);
    // 3. count frequncy of each digit
    // 3.1 take another parllel array to avoid duplication
    int visited[] = new int[noofdigits];
    for (int o = 0; o < noofdigits; o++)
      visited[o] = -1;
    // 3.2 to count frequncy compare cell i with all other cells from i+1 to last
    // cell
    for (int m = 0; m < noofdigits ; m++) {
      int count = 1;
      for (int n = m + 1; n < noofdigits; n++) 
      {
        if (digits[m] == digits[n] && visited[n] == -1) 
        {
          count = count + 1;
          visited[n] = 0;
        }
      }
      if (visited[m] != 0)
        System.out.println(digits[m] + " frequencny is " + count);
    }
  }
}