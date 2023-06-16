// Exercise 2
public class two {
  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      System.out.println(DigitToEnglish(Integer.parseInt(args[i])));
    }
  }

  public static String DigitToEnglish(int x) {
    switch (x) {
      case 0: return "zero";
      case 1: return "one";
      case 2: return "two";
      case 3: return "three";
      case 4: return "four";
      case 5: return "five";
      case 6: return "six";
      case 7: return "seven";
      case 8: return "eight";
      case 9: return "nine";
      default: return "ERRRR!!! Invalid input. Try again..."; 
    }
  }
}