package test.sandbox;

public class First {

  public static void main(String[] args) {
    hello("world");
    hello("Tatiana");

    Square s = new Square(5);
    System.out.println("The area of square is " + s.area());

    Rectangle r = new Rectangle(4,5);
    System.out.println("The area of rectangle is " + r.area());
  }
  public static void hello(String user) {
    System.out.println("Hello, " + user + "!");
  }

  }
