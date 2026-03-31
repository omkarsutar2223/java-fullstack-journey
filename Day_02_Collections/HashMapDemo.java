import java.util.HashMap;
import java.util.Scanner;

class HashMapDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    HashMap<String, String> contacts = new HashMap<>();

    System.out.println("--------- Welcome to smart contact----------");
    System.out.print(" Enter contact name  ");

    String name = sc.nextLine();

    System.out.print("Enter contact number");
    String number = sc.nextLine();

    contacts.put(name, number);

    System.out.println("saved.....");

    System.out.println("contact list" + contacts);

    sc.close();

  }
}