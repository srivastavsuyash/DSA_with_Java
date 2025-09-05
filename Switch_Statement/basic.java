package Switch_Statement;

import java.util.Scanner;

public class basic {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // String fruit = in.next();
      
    /*
     //Syntax of Switch Statement:
      switch(expression){
        case one:
          //do something
          break;
        case two:
          //do something
          break;
        default:
          //do something
      }
    */

      // switch (fruit) {
      //   case "Mango":
      //     System.out.println("King of the fruit");
      //     break;
      //   case "Apple":
      //     System.out.println("A sweet red fruit");
      //     break;
      //   case "Orange":
      //     System.out.println("Round fruit");
      //     break;
      //   case "Grapes":
      //     System.out.println("Small fruit");
      //     break; 
      //   default:
      //     System.out.println("Please enter the valid fruit");
      // }

    int day = in.nextInt();
    switch (day) {
      case 1 -> System.out.println("monday");
      case 2 -> System.out.println("tuesday");
      case 3 -> System.out.println("wednesday");
      case 4 -> System.out.println("thurssday");
      case 5 -> System.out.println("friday");
      case 6 -> System.out.println("Saturday");
      case 7 -> System.out.println("Sunday");
    }

    in.close();
    }
  }

