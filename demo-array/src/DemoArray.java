import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args)  {

    // declare array
     int[] arr = new int[3];
     // assign value to array
     arr[0] = 3;
     arr[1] = 10;
     arr[2] = 11;
    // for loop -> read array value
    // Print all values, which >= 10
    for (int i = 0; i < arr.length; i++){ // i = 0,1,2
        if( arr[i] >=10){
        System.out.println(arr[i]);}
    }

    // declare double array, length = 5
    // assign values -> 10.4, 4.3, 3.3, 1.9, 9.9
    // Sum up all values in the double array
    double [] arr2 = new double[5];
    arr2[0] = 10.4;
    arr2[1] = 4.3;
    arr2[2] = 3.3;
    arr2[3] = 1.9;
    arr2[4] = 9.9;
    double sum = 0;
    for (int i = 0; i < arr2.length; i++){
    sum = sum + arr2[i];
    }
    System.out.println(sum);

    // "abc", "def" "ijk"
    // "abc"
    boolean isTargetExist = false;
    String[] arr3 = new String [3];
    arr3[0] = "abc";
    arr3[1] = "def";
    arr3[2] = "ijk";
    String target = "abc";
    for (int i = 0; i < arr3.length; i++){
    if (target.equals("arr3[i]")) {
    isTargetExist = true;
    }
    }
    System.out.println(isTargetExist);

    char [] arr4 = new char[]{'b', 'c', 'a'};
    //convert the char value to int value, and then assign them to a new array
    int [] arr5 = new int[arr4.length];
    for (int i = 0; i < arr4.length; i++) {
    arr5[i] = arr4[i]; // char value (arr4[i] -> int variable arr5[i])
    System.out.println(arr5 [i]);
    }
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr5.length; i++) {
    if (arr5 [i] > max){
    max = arr5[i]; 
    }
    // Find the max ascii value in the int array
    // Step 1: i = 0, 98 > 0 -> true -> put 98 to max
    // Step 2: i = 1, 99 > 98 -> true, put 99 to max
    // Stemp 3: i = 2, 97 < 99 -> false -> exit
    }
    System.out.println(max);

    // Find the min value in the int array
    int [] arr10 = new int[] {9, -8, -99, 98};
    //System.out.println(min);
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr10.length; i++)
    if (min > arr10 [i]){
        min = arr10 [i];
    }
    System.out.println(min);

    // array sum
    int sum1 = 0;
    for (int i = 0; i < arr10.length; i++)
    {
        sum1 = sum1 + arr10[i];
    }
    System.out.println(sum1);

    // swap
    int left = 7;
    int right = 9;
    int temp = 7;
    left = right;
    right = temp;
    System.out.println(left);
    System.out.println(right);

    // array
    int [] arr8 = new int [] {9, -8, 109, 99, 98};
    // print 1 (9 + -8)
    // print 101 (-8 + 109)
    // ...
    // print 197 (99 + 98)
    for (int i = 0; i < arr8.length-1; i++)
    {  System.out.println(arr8[i] + arr8[i+1]);
    }


    // array swap
    int [] arr7 = new int[] {9, -8, 109, 99, 98};
    // move max value to the tail
    //for loop + swap
    for (int i = 0; i < arr7.length - 1; i++){
        if (arr7[i] > arr7[i+1]){
            temp = arr7[i+1];
            arr7[i+1] = arr7[i];
            arr7[i] = temp;
        }
    }
    
    System.out.println(Arrays.toString(arr7));

    Integer[] arr11 = new Integer[] {9, 6, 4};
    // Products for all numbers
    int product = 1;
    for (int i = 0; i < arr11.length; i++){
        product *= arr11[i];
    }
    System.out.println(product);

    double[] prices = new double[] {8.2, 6.5, 10.5};
    int[] quantities = new int[] {9,8,3};
    double totalPrice = 0;
    for (int i = 0; i < quantities.length; i++){
        totalPrice += prices[i] * quantities[i];
    }
    System.out.println(totalPrice);

    String s = String.valueOf(123);
    System.out.println(s);
    s = String.valueOf(true);
    System.out.println(s);
    System.out.println(String.valueOf('A'));

    Integer i1 = Integer.valueOf("123");
    System.out.println(i1);

    //Integer i2 = Integer.valueOf("h"); // java.lang.NumberFormatException
    //System.out.println(i2);

    // "hello"
    char[] chArr = "hello".toCharArray();
    char cTemp;
    System.out.println(chArr[3]);
    for (int i = 0; i < chArr.length / 2; i++){
        cTemp = chArr[i];
        chArr[i] = chArr[chArr.length -1 - i];
        chArr[chArr.length -1 - i] = cTemp;
    }
    System.out.println(chArr);
    String result = "";
    for (int i = 0; i < chArr.length; i++){
        result += chArr[i];
    }
    System.out.println(result);

    // h -> i, e -> f, l-> m, o -> p
    // ifmmp
    chArr = "hello".toCharArray();
    int [] h = new int [5];
    for (int i = 0; i < chArr.length; i++){
        chArr[i] = (char) (chArr[i] + 1);
    }
    System.out.println(String.valueOf(chArr)); // "ifmmp", char Array -> String
    // assum we have small leter ONLY
    char [] arr12 = new char[] {'p', 'a', 'p', 'b', 'a', 'p'};
    // more than one loop;
    for (int i = 0; i < arr12.length-1; i++){
        for (int j = 0; j < 26; i++){
            
        }
    }
    System.out.println(maxNumChar); // p
}
}