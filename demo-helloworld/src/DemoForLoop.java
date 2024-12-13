public class DemoForLoop {
  public static void main (String[] args) {
    // 2^100
    int x = 2;

    //For Loop
    // ! for (; ;){
    // }


    // "i < 3" -> continue criteria
    // "i++" -> modifier
    // ! You have to let the modifier work with continue creiteria", 
    // ! so that the continue creiteria at the end become false
    for (int i = 0; i < 3; i++) { // 0,1,2
      System.out.println("hello");

    }
    // Step 1: int i = 0;
    // Step 2: i < 3 (question) -> true
    // Step 3: if true, print hello
    // Step 4: i++, i become 1
    // Step 5: i < 3 (question) -> true
    // Step 6: if true, print hello
    // Step 7: i++, i become 2
    // Step 8: i < 3 (question) -> true
    // Step 9: if true, print hello
    // Step 10: i++, i become 3
    // Step 11: i < 3 (question) -> false
    // Step 12: exit for loop
    for (int i = 0; i < 11; i++){
      System.out.print(x *= 2);
    }


    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    // print even numbers
    for (int i = 0; i < 10; i++) {
      if ( i % 2 == 0) {
        System.out.println(i);
      }
    }
    // print 0 - 100, divided by 3 and divided by 4
    // for + if
    for ( int i = 0; i < 101; i++) {
      if ( i % 3 == 0 && i % 4 == 0) {
        System.out.println(i);
      }
    }

    // sum up 0 - 20
    int oddSum = 0;
    int evenSum = 0;
    for (int i = 0; i <= 20; i++) {
      if (i % 2 == 1); {
      oddSum += i;
    } else {
      if (i % 2 == 0);{
      evenSum += i;
        }
        }

      int diff = oddSum > evenSum ? oddSum - evenSum : evenSum - oddSum;
      System.out.println(diff);





    // System.out.println(i); // ! i is declared within the for loop.

    // sum up all odd numbers between 0 - 10

    // sum up all even numbers between 0 - 10
    // even sum-oddsum
    // ! Find the difference between evenSum and oddSum -> positive number

    String str = "abcdefijk";
    // 1. Check if 'd' exists in the string.
    // for loop + if, charAt
    boolean found = false;
    for (int i = 0; i < str.length(); i++){
      if (str.charAt(i) == 'd') {
        found = true;
        break; // break the nearest loop
      }
      }
      System.out.println(found);
      //Test Case:
      // 1. "abcdefijk"
      // 2. "abcefijk"
      // 3. ""
      // 4. "abcdefijkd"

      // 2. check if the string value contains given sub-string
      String substr = "loq";
      String str2 = "hello";
      // for loop + substring
      boolean isSubstringExist = false;
      for (int i = 0; i < str2.length() - substr.length()+1; i++) {
        if (str2.substring(i, i+2).equals(substr)) {
          isSubstringExist = true;
          break;
        }
      }

      System.out.println(isSubstringExist); //true





  }
}
