import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args){
    double result = 0.2 + 0.1;
    System.out.println(result);
    if (result == 0.3) {
      System.out.println(result);}
      if (result == 0.3){
        System.out.print("Result is 0.3.");
      } else {
        System.out.println("Result is NOT 03.3.");
      }
    
      // Solution: BigDecimal
      BigDecimal bd1 = BigDecimal.valueOf(0.2);
      BigDecimal bd2 = BigDecimal.valueOf(0.1);
      BigDecimal bd3 = bd1.add(bd2);
      System.out.println(bd3.doubleValue());

      System.out.println(0.3 - 0.1);
      // substract
      BigDecimal bd4 = BigDecimal.valueOf(0.3);
      BigDecimal bd5 = BigDecimal.valueOf(0.1);
      BigDecimal bd6 = bd4.subtract(bd5);
      System.out.println(bd6.doubleValue());

      BigDecimal bd7 = BigDecimal.valueOf(0.1);
      BigDecimal bd8 = BigDecimal.valueOf(0.2);
      BigDecimal bd9 = bd7.multiply(bd8);
      System.out.println(bd9.doubleValue());

      BigDecimal bd10 = BigDecimal.valueOf(0.3);
      BigDecimal bd11 = BigDecimal.valueOf(0.1);
      BigDecimal bd12 = bd10.divide(bd11);
      System.out.println(bd12.doubleValue());

      // 10 / 3
      BigDecimal bd13 = BigDecimal.valueOf(10);
      BigDecimal bd14 = BigDecimal.valueOf(3);
      BigDecimal bd15 = bd13;
      System.out.println(bd15.doubleValue()); // Non-terminating decimal expansion

      BigDecimal bd16 = BigDecimal.valueOf(4.565).setScale(2, RoundingMode.HALF_DOWN);
      System.out.println(bd16.doubleValue());

      BigDecimal bd17 = BigDecimal.valueOf(4.566);
      System.out.println(bd17.setScale(2, RoundingMode.HALF_DOWN));
      System.out.println(bd17.setScale(2, RoundingMode.HALF_UP));

      BigDecimal bd18 = BigDecimal.valueOf(4.565);
      System.out.println(bd18.setScale(2, RoundingMode.HALF_DOWN));
      System.out.println(bd18.setScale(2, RoundingMode.HALF_UP));
      
      BigDecimal bd19 = BigDecimal.valueOf(4.561);
      System.out.println(bd19.setScale(2, RoundingMode.UP));
      System.out.println(bd19.setScale(2, RoundingMode.DOWN));

      double length = 4.2;
      double squareArea = BigDecimal.valueOf(length).
      multiply(BigDecimal.valueOf(length)).doubleValue();
      System.out.println(BigDecimal.valueOf(squareArea)); 

    // Math
    double pi = 3.14159;
    double radius = 4.5;
    double circleArea = BigDecimal.valueOf(radius)
    .multiply((BigDecimal.valueOf(radius)))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
    System.out.println(circleArea);

    circleArea = BigDecimal.valueOf(Math.pow(radius, 2.0))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
    System.out.println(circleArea);

    int x = 8;
    int y = 9;
    int max = Integer.MIN_VALUE;
    max = Math.max(x, max); // if (X > max) {max = x;}
    max = Math.max(y, max);

    int[] arr = new int []{10, 9, 3};
    max = Integer.MIN_VALUE;
    for (int i = 0; 1< arr.length; i++) {
      max = Math.max(arr[i], max);
    }
    //System.out.println(max);
    System.out.println(Math.sqrt(9)); //Java auto convert int value to double value
    System.out.println(Math.sqrt(10)); //3.1622776601683795
    System.out.println(Math.sqrt(-10));//NaN

    // round() -> nearest to integer

    double u = 3.456;
    System.out.println(Math.round(u));

    System.out.println(Math.round(u * 100.0) / 100.0);
    
    double u2 = 3.556;
    System.out.println(Math.round(u2));

    System.out.println(Math.abs(-9L)); // 9
  }
}
