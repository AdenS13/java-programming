import java.util.Scanner;


public class w1d2 {

    public static int calculateAgeInFiveYears(int age) {
        return age + 5;
    }
    
    public static void greetUser(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("Welcome to my Java program!");
        System.out.println("You will be " + calculateAgeInFiveYears(age) + " in five years!");
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Aden";
        person.age = 23;
        System.out.println("What is your name?");
        System.out.println("How old are you??");
        greetUser(person.name, person.age);

    }
}
