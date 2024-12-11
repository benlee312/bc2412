public class DemoComparison {
  public static void main(String[] args) {
    // >, <, >=, <=, !=, ==
    // "==" -> check if they are euqals
    //"=" assignment

    int age = 20;
    boolean isAdult = age > 18; // adult defintion
    System.out.println(isAdult);
    boolean notAdult = age < 18;
    System.out.println(notAdult);

    double pi = 3.14159;
    boolean isCorrect = pi == 3.14159;
    System.out.println(isCorrect);

    char gender = 'M';
    boolean isMale = gender == 'M';
    System.out.println(isMale);
    boolean isFemale = gender == 'F';
    System.out.println(isFemale);

    float price = 10.2f;
    System.out.println(price != 10.2f);
    System.out.println(price != 10.2); //during comparesion, convert price to double before comparison

    // ! operator (NOT)
    boolean result = !isAdult;
    System.out.println(result);
    if (age >= 18) { //not good
      price /= 2;
    }
    if (!isAdult){ 

    }
    // && AND
    int age2 = 30;
    char gender2 = 'F';
    boolean result2 = age2 >= 30 && gender2 == 'M';
    // event 1: age2 >= 30 -> true
    // event 2: gender 2 =='M' -> false
    System.out.println(result2); // false
    // || OR
    boolean result3 = age2 >= 30 || gender2 == 'M';
    // event 1: age2 >= 30 -> true
    // event 2: gender 2 =='M' -> false
    System.out.println(result3); // true

    // || OR (true || false)
    int age3 = 40;
    char gender3 = 'F';
    boolean result4 = age3 >= 30 || gender3 == 'M';
    System.out.println(result4);

    // || or (false || false) -> false
    boolean result41 = age3 <= 30 || gender3 == 'M';
    System.out.println(result41);

    // AND OR (true AND (false or true))
    int age4 = 12;
    char gender4 = 'M';
    String work = "Student";
    boolean result5 = age4 <= 18 && (gender4 =='F' || work == "Student");
    System.out.println(result5);
    // Step 1: (gender4 =='F' || work == "Student") ->false || true -> true
    // Step 2: age4 <= 18 -> true, true && true -> true

    // ! THe ordering of event checking is different
    // AND go first
    boolean result6 = work == "Student" || age4 <= 18 && gender4 =='F';
    // Step 1: age4 <= 18 && gender4 =='F' -> true && false -> false
    // Step 2: true || false -> true
    System.out.println(result6);
  }
  
}
