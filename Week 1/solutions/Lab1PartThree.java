import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class Lab1PartThree {

  public static void exercise1() {
    // code for exercise 1 goes here
    System.out.println("Enter the radius");
    Scanner keyboard = new Scanner(System.in);
    double radius = keyboard.nextDouble();
    double area = radius * radius * Math.PI;
    System.out.println(
      "A circle with radius " +
      radius +
      " has an area of " +
      String.format("%.2f", area) +
      " units"
    );
  }

  public static void exercise2() {
    // code for exercise 2 goes here
    System.out.println("Enter n");
    Scanner keyboard = new Scanner(System.in);
    int n = keyboard.nextInt();
    System.out.print("Even numbers from 2 to " + n + ": ");
    for (int i = 2; i <= n; i = i + 2) {
      System.out.print(i + " ");
    }
  }

  public static void exercise3() {
    Random r = new Random();
    int rand1 = r.nextInt(1000);
    int rand2 = r.nextInt(1000);
    int prod = rand1 * rand2;
    System.out.println(
      "What is the product of " + rand1 + " and " + rand2 + " ?"
    );
    System.out.println("The answer is " + prod);
  }

  public static void exercise4() {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("hi");
    String response = keyboard.nextLine();
    String[] triggerWords = { "hey", "how are you?", "Thats so cool" };
    java.util.Random r = new java.util.Random();
    while (!response.equals("exit")) {
      System.out.println(triggerWords[r.nextInt(3)]);
      response = keyboard.nextLine();
    }
    System.out.println("bye");
  }

  public static void main(String[] args) {
    exercise1(); // invokes the exercise1( ) method
    exercise2(); // invokes the exercise2( ) method
    exercise3();
    exercise4();
  }
}
