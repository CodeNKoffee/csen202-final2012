// Exercise 3
public class three {
  public static void main(String[] args) {
    System.out.println(lucas(7));
  }

  public static int lucas(int n) {
    return (n == 0) ? 2 : ((n == 1) ? 1 : lucas(n - 1) + lucas(n - 2));
  }
}