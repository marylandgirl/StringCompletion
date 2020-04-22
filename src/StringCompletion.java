import java.util.Scanner;
/*
* This program is the "String completion assignment" from Java Bootcamp
* It was missing 3 lines of code that needed to be added to get it running
* These lines have been added
* Kim Levin
* April 21, 2020
*/
public class StringCompletion {
   public static void main(String[] args) {

      Scanner keyboard = new Scanner(System.in);

      String name;
      String breed;
      int age;

      //Get pet's name
      System.out.print("Greetings: What is your pet's name? ");
      name = keyboard.next();

      //Get pet's breed
      System.out.print("What kind of animal is " + name + " ? ");
      breed = keyboard.next();

      //Get pet's age
      System.out.print("How old is " + name + "? ");
      age = keyboard.nextInt();

      //Display pet's name, breed & age to screen  
      System.out.println(name + " is your " + breed + " and it is " + age);
   }
}
