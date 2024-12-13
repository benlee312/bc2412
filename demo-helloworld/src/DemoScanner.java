import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    // Java Project (load built-in tools, String, Primitives)
    // proactively import non-bulit-in tools (Scanner)
    String s ="abc";
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input a number");
    int num = scanner.nextInt(); //scanner.next
    num = num * 2;
    System.out.println("num=" + num); // String + int -> String
    scanner.nextLine();

    System.out.println("PLease input a String:");
    String str = scanner.nextLine();
    System.out.println("str=" + str);

    System.out.println("Please input a number");
    int num1 = scanner.nextInt();
    for (int i = 0; i < num1; i++){
    System.out.println("Hello");
    }
    // num -> numbers of days
    // for loop
    System.out.println("Please input numbers of days");
    int num2 = scanner.nextInt();
    int totalMinutes = ' ';
    for (int i = 0; i < num2; i++){
      for (int j = 0; j <= 1440; j++)
        totalMinutes = j;
      
    }
    System.out.println("The total minutes is :" + totalMinutes);
  }
}
