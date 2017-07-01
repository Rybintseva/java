package test.sandbox;

public class First {

  public static void main(String[] args) {
    hello("world");
    hello("Tatiana");

    double len = 5;
    System.out.println("The area of square is " + area(len));

    double a = 7;
    double b = 98;
    System.out.println("The area of rectangle is " + area(a, b));
  }
  public static void hello(String user) {
    System.out.println("Hello, " + user + "!");
  }

  public static double area(double l) {
    return l * l;
  }

  public static double area(double a, double b) {
    return a * b;
  }
}
