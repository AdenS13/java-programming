import java.util.Scanner;


public class w1d2 {

    public static void main(String[] args) {
        Person person1 = new Person("Aden", 23);
        Person person2 = new Person("Sarah", 25);
        int birthYear1 = person1.getBirthYear();
        int birthYear2 = person2.getBirthYear();

        person1.introduce();
        person2.introduce();
        
        person1.celebrateBirthday();
        person2.celebrateBirthday();

        System.out.println(person1.name + " was born in " + birthYear1);
        System.out.println(person2.name + " was born in " + birthYear2); 
    }
}
