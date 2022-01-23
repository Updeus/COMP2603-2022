import java.util.Scanner;

public class Lab1Part2 {

  public static void main(String[] args) {
    System.out.println("My name is Englebert.");

    String lastname;
    lastname = "Humperdinck";
    System.out.println("My name is Englebert " + lastname);

    Scanner keyboard = new Scanner(System.in);
    lastname = keyboard.nextLine();
    System.out.println("My name is Englebert " + lastname);
  }

  public static void option5() {
    System.out.println("Hi, what's your name?");
    Scanner keyboard = new Scanner(System.in);
    String name = keyboard.nextLine();
    System.out.println("Nice to meet you " + name + "!");
  }

  public static void option6() {
    System.out.println("Hi, what's your name?");
    Scanner keyboard = new Scanner(System.in);
    String input = keyboard.nextLine();
    String name = input.substring(11);
    //String name = input.substring(11, input.length());
    System.out.println("Nice to meet you " + name + "!");
  }
}
