public class Exercise20241210 {
  public static void main(String[] args){
    double priceForApple = 7.3;
    double priceForOrange = 6.5;
    int quantityOfApple = 3;
    int quantityOfOrange =4;
    double totalAmount = priceForApple * quantityOfApple + priceForOrange * quantityOfOrange;
    System.out.println(totalAmount);

    int mathScore = 73;
    int englishScore = 60;
    int historyScore = 61;
    double averageScore= ( mathScore + englishScore + historyScore) /3.0;
    System.out.println(averageScore);

    // byte, short, int, long
    byte maxByte = 127;
    byte b2 = -128;
    maxByte = maxByte + 1; // Java: is it safe? not safe
    System.out.println(maxByte); // 128, overflow
    b2 = b2 / 1;
    short s1 = 32767;
    short s2 = -32768;
    int x = maxByte; // Java: is it safe? it is safe

  //maxByte = (byte) (maxByte + 1); can be done but have risk
  //System.out.println(maxByte); // 128, overflow

  // ! Java: (1) Compile time + (2) Run time
  // because already install the Java, VS code can understand Java and notice the error
  //(1) java file (.java) -> class file (.class): java code -> byte code (~machine)
    // (1.1) compile fail. for example (missing ; -> syntax error)
    // (1.2) compile success -> class file
  // (2) Java Virtual Machine (JVM) -> convert class file to machine code -> execute machine code
  }

  }

