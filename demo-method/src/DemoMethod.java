public class DemoMethod {

    // ! sum(int x, int y) -> input parameters
    // ! int -> return type 
    public static int sum(int x,  int y){
        int result = x + y;
        return result; // the return value should align the return type
}
    public static double substract(double x, double y){
        return x - y;
    }
    public static int countCharacter(String source, char target) {
        // toCharArray
        int count = 0;
        for (int i = 0; i < source.length(); i++){
            if (target == source.charAt(i)){
                count++;
            }
        }
        return count;
            }
        

    
    public static void main(String[] args) {
        int x = 3;
        int a = 10;
        int b = 11;
        int y = a + b;
        System.out.println(y); //21
        a = 19;
        b = 21;
        y= a + b;
        System.out.println(y);
        
        // call sum() method
        y = sum(5000, 231);
        System.out.println(y);
        y = sum(21364, 234);
        System.out.println(y);
        System.out.println(substract(100, 98));

        System.out.println(countCharacter("hello", 'l')); //2
        System.out.println(countCharacter("abc", 'l')); // 0
        System.out.println(countCharacter("", 'l')); // 0
        System.out.println(countCharacter("abc", 'a')); // 1
}
}
