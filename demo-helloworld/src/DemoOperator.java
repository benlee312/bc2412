public class DemoOperator {
  public static void main(String[] args){
    // + 1
    int x = 3;
    x = x + 1;
    x++;
    ++x;
    x += 1; // += means x = x + 1
    System.out.println(x); //7

    // -1
    int y = 10;
    y = y - 1;
    y--;
    --y;
    y -= 1;
    System.out.println(y); //6

    //+2..
    int b = 10;
    b = b + 2;
    b += 2;
    System.out.println(b);

    //-2..
    int c = 50;
    c = c - 2;
    c -= 2;
    System.out.println(c);

    //*=, /=
    int m = 5;
    m = m * 2;
    m *= 2;
    System.out.println(m);

    int u = 4;
    u = u / 2;
    u /= 2;
    System.out.println(u);

    int remainder = 10 % 3;
    System.out.println(remainder);

    // ++x vs x++
    int a = 8;
    int result1 = ++a + 3;
    System.out.println(result1); // 8+1 +3
    System.out.println(a);
    // Step 1: a become 9
    // Step 2: a + 3 (9 + 3)
    // Step 3: assign 12 to result1

    int q = 8;
    int result2 = q++ + 3;
    System.out.println(result2);
    System.out.println(q);
    // Step 1: q + 3 (8 + 3)
    // Step 2: assign 11 to result 2
    // Step 3: q become 9

    // String +=
    String s = "hello";
    s += "!";
    System.out.println(s); // hello!
    // int + double -> double
    // String + anything -> String

    s += 'a';
    System.out.println(s); //hello!a

    s += 1;
    System.out.println(s);

    s += true;
    System.out.println(s); // hello!a1true
    
    int x11 = 3;
    int y11 = (x11++ + 3) * x11++;
    System.out.println(y11);
    // Step1: 3 + 3
    // Step2: x11 become 4
    // Step3: 6 * 4
    // Step4: assignment
    // Step5: x11 become 5



    }
}
