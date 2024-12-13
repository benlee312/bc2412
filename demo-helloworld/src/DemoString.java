public class DemoString {
  public static void main(String[] args) {
    char x = 'a';
    x = 1; // ! ???
    // x = 1.1;
    // x = true;
    x = 'x';
    // char x = 'o';

    // ! dfine a String value by double quote ""
    // ! define a char value by single quote ''
    String password = "abcd1234";
    String emailAddress = "abc@gmail.com";

    // + operation
    password = password + "!";
    System.out.println("helloworld");
    System.out.println(password); // abcd1234!
    // String is not primative, so S /tools
    // Java Method (Instance method)
    // action
    char result = password.charAt(0); //0 represents the first position of the string value
    System.out.println(result); // a

    // ! index starts from 0 to length-1
    System.out.println(password.charAt(8));
    //System.out.println(password.charAt(-1));;
    //System.out.println(password.charAt(100));// error

    //Problem: print the last character of string.
    String password2 = "helloworld";
    char lastChar = password2.charAt(password2.length()-1);
    System.out.println(lastChar);

    // equals() -> true and false
    String s1 = "abc";
    String s2 = "abc";
    boolean result2 = s1.equals(s2);
    System.out.println(result2); // true
    String s3 = "2344sfw";
    boolean result3 = s2.equals(s3);
    System.out.println(result3);

    //length()
    int result4 = password.length();
    System.out.println(result4); //9, the length of String value

    //Empty String
    String emptyString = "";
    boolean isStringEmpty = "".equals(emptyString);// asking if emptyString equal to ""
    System.out.println(emptyString.length());

    String s = "hello";
    System.out.println("hello".equals(s));

    System.out.println("hello".charAt(2));
    System.out.println("hello".length());
    //Only String can use as only String has tool, primitive has no method(tool)

    // isEmpty ()
    String s5 = "abc";
    boolean isEmpty = s5.length() == 0;
    System.out.println(isEmpty);
    System.out.println(s5.isEmpty());


    // substring
    // abc
    String substr = s5.substring(0, 2);
    // ! s5's value doesn't change
    // ! substr is storing a new String value returned by "substring"
    System.out.println(substr);
    System.out.println(s5.substring(0, 3));
    System.out.println(s5.substring(0, s5.length()));
    System.out.println(s5.substring(1));
    }
}
