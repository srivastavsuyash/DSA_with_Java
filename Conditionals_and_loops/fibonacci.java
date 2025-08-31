package Conditionals_and_loops;

import java.util.Scanner;

public class fibonacci {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    // Find the first nth fibonacci numbers
    int n = in.nextInt();
    int a = 0;
    int b = 1;
    int count = 2;
    while(count <= n){
      int temp = b;
      b = a + b;
      a = temp;
      count++;
    }
    System.out.println(b);
    in.close();
  }
}
