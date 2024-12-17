public class DemoWrapperClass {
    public static void main(String[] args) throws Exception {
        int x = 3; // x is a Primitive Type variable
        Integer x2 = x; // auto-box
        System.out.println(x2);
        System.out.println(x2.doubleValue());
        System.out.println(x2.longValue());
        System.out.println(x2);

        String s = "hello";
        System.out.println(s.length()); // 5

        double d = 3.3;
        Double d2 = d; // auto-box
        System.out.println(d2);
        System.out.println(d2.intValue()); // 3
        float f = d2.floatValue();
        System.out.println(f); // 3.3

        double d3 = d2.doubleValue(); // un-box
        double d4 = d2; // un-box

        // char -> Character
        // boolean -> Boolean
        // byte -> Byte
        // short -> Short
        // float -> Float
        char c = 'a';
        Character c2 = c;
        System.out.println(c2.compareTo('a'));
        //0-> equals
        Character c3 ='c';
        System.out.println(c3.compareTo('a')); // 2 (ascii of 'c' > ascii of 'a')
        Character c4 = 'A';
        System.out.println(c4.compareTo('a'));  // 2 (ascii of 'A' > ascii of 'a')
        char c5 = c2.charValue();

        int asciiOfA = 'A';
        int asciiOfa = 'a';
        System.out.println(asciiOfa - asciiOfA);
        System.out.println('a' - 'A'); // 32, char value - char value -> int value -> int value


        boolean b = false;
        Boolean b2 = b;
        boolean b3 = b2.booleanValue();

        byte bt = 21;
        Byte bt2 = bt;
        byte bt3 = bt2.byteValue();

        short ss = 123;
        Short ss2 = ss;
        short ss3 = ss2.shortValue();

        float ff = 61;
        Float f2 = ff;
        float f3 = f2.floatValue();

    }
}
