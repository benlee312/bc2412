public class DemoDataType {
  public static void main(String [] args){
    // Comment. Welcome to bootcamp.(// can draw notice)
    // ! 1. Data Type (Primitive)
    // int-> Integer
    // x, dayOfWeek -> variable
    int x = 3;
    int dayOfWeek = 7; // ! first letter cannot be Captial letter, other ok
    // int y = 3.2; // ! not OK, y is a variable that can store integer only.
    double y2 = 3.2;
    // variable Java naming convension
    // caml case: dayOfWeek, y2, letter first and number later

    // Re-assignment
    x = 101;
    x = x + 10;//111
    x = x - 40; //71
    x = x * 3; //213
    x = x / 213; //1
    System.out.println(x);
    x = x + 8 * 2 / 4 + 1;
    // 8 * 2 / 4 =4
    // 1 + 4 +1
    //6
    System.out.println(x);

    x = (x + 2) * 2 / (3 + 1); //4
    System.out.println(x);
    x = ((x+3) / (6 + 1)) * (x + 1);//5
    System.out.println(x);
    //divide
    int x2 = 3 / 2;
    System.out.println(x2);
    // Step 1: 3 -> int value, 2 -> int value
    // Step 2: int value / int value -> int value
    // Step 3: 3 / 2 -> 1(int)
    // Step 4: assign 1 (int value) int type variable
    double x3 = 3 / 2;
    // Step 1: 3 -> int value, 2 -> int value
    // Step 2: int value / int value -> int value
    // Step 3: 3 / 2 -> 1(int)
    // Step 4: assign 1 (int value) to double type variable (OK!)
    System.out.println(x3); //1.0
    double x4 = 3.0 / 2;
    // Step 1: 3.0 -> double value, 2 -> int value
    // Step 2: double value / int value -> double value
    // Step 3: 3.0 / 2 -> 1.5(double)
    // Step 4: assign 1.5 (double value) to double type variable
    System.out.println(x4); // 1.5

    //divide by 0
    //int f = 10 / 0;
    //System.out.println(f); // ! error

    //0/10
    System.out.println(0/10);
    // ! int x5 = 3.0 / 2;
    // Step 1: 3.0 -> double value, 2 -> int value
    // Step 2: double value / int value -> double value
    // Step 3: 3.0 / 2 -> 1.5(double)
    // Step 4: assign 1.5 (double value) to int type variable (downcasting)
    // ! NOt allow assign a higher level value to a lower level type of variable
    // int -> double (upcast)
    // doublt -> int (downcast)

    // ! Store Integer. Java: int, byte, short, long
    int value = 1000000;
    int value2 = 1_000_000;
    int maxInterger = -2_147_483_648;
    // int maxInterger = 2_147_483_648
    // int minInteger = -2_147_483_649
    // !byte -128 to 127
    // assign an int value to byte type variable
    byte b1 =-128;
    byte b2 =127;
    // !Short -32768 to 32767
    short s1 = -32768;
    short s2 = 32767;
    // !long -2 ^ 63 
    //2_147_483_648-> int value
    long l1 = 2_147_483_648;
    // ! Step 1: declare an int value (fail)
    // ! Step 2: convert an int value to long type
    // ! Declare a hardcode long value, you should always add "L"
    long l2 = 2_147_483_648L; // "L" -> declare it is a long value
    }
}