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
    int max = 0;
    for (int i = 0; i < arr5.length; i++) {
    if (arr5 [i] > max){
    max = arr5[i]; 
    }
    // Find the max ascii value in the int array
    }
    System.out.println(max);

    // Find the min value in the int array
    int [] arr10 = new int[] {9, -8, -99, 98};
    //System.out.println(min);
    int min = 0;
    for (int i = 0; i < arr10.length; i++)
    if (min > arr10 [i]){
        min = arr10 [i];
    }
    System.out.println(min);
    }
}