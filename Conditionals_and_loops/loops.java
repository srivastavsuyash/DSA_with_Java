package Conditionals_and_loops;
import java.util.Scanner;
public class loops {
  public static void main(String[] args) {
    /*
      Syntax of for Loops:
      for(initialization; condition; increment/decrement){
        //body    
      } 
    */

    //Q: Print numbers from 1 to 5

    // for(int n = 1; n <= 5; n++){
    //   System.out.println(n);
    // }

    //Q: Print the numbers from 1 to n

    // Scanner in = new Scanner(System.in);
    // int n = in.nextInt();
    // for (int i = 1; i < n; i++) {
    //   System.out.print(i + " ");
    // }
    // in.close();


    /*
      Syntax of while loops:
      while(condition){
        //body
      }
    */

    // int num = 1;
    // while (num<=10){
    //   System.out.print(num + " ");
    //   num++;
    // }


    // Scanner in = new Scanner(System.in);
    // int n = in.nextInt(); 
    // int i = 1;
    // while(i<=n){
    //   System.out.print(i + " ");
    //   i++;
    // }
    // in.close();

    /*
      Syntax of do while loops:
      do{
        //body
      }
      while(conditions);
    */

    int n = 1;
    do{
      System.out.print(n + " ");
      n++;
    }
    while(n <= 10);
  }
}
