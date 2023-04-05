import java.util.Scanner;

public class program {
  public static int getMonthAsInt(String monthString) {
    int monthInt;

    // Java switch/case statement
    switch (monthString) {
      case "January":
        monthInt = 1;
        break;
      case "February":
        monthInt = 2;
        break;
      case "March":
        monthInt = 3;
        break;
      case "April":
        monthInt = 4;
        break;
      case "May":
        monthInt = 5;
        break;
      case "June":
        monthInt = 6;
        break;
      case "July":
        monthInt = 7;
        break;
      case "August":
        monthInt = 8;
        break;
      case "September":
        monthInt = 9;
        break;
      case "October":
        monthInt = 10;
        break;
      case "November":
        monthInt = 11;
        break;
      case "December":
        monthInt = 12;
        break;
      default:
        monthInt = 0;
    }

    return monthInt;
  }

  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    // TODO: Read dates from input, parse the dates to find the ones
    // in the correct format, and output in m-d-yyyy format
    while(true){  // Loop through all intput given
      String input = scnr.nextLine();
      if(input.equals("-1")){   // exit if -1 given
        break;
      }

      String[] str = input.split(" ");  // Split the input up into an array
      if(str.length == 3 && str[1].endsWith(",") && str[2].length() == 4){
        int month = getMonthAsInt(str[0]);
        if(month > 0){
          int day = Integer.parseInt(str[1].substring(0, str[1].length() -1));
          int year = Integer.parseInt(str[2]);
          System.out.println(month + "-" + day + "-" + year);
        }
      }
    }
  }
}
