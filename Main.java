import java.util.Scanner;

public class Main   {

        public static void greetUser() {
        System.out.println("Welcome to my Java program!");
    }
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        greetUser();

        while(true){
            System.out.println("How old are you?");
            int age = scanner.nextInt();
                if(age >= 18) {
                    System.out.println("You are an adult!");
            }   else if(age == 0){
                    break;
            }   else if(age < 0) {
                    System.out.println("That isn't a valid age.");
            }   else if(age < 13) {
                    System.out.println("You are a child!");
            }   else {
                    System.out.println("You are a teenager!");
        }
        }
    }
}