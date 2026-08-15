import java.util.Scanner;


public class JavaOOP {

    public static void main(String[] args) {
        Person person1 = new Person("Aden", 23);
        Person person2 = new Person("Sarah", 39);
        Person person3 = new Person("Destiny", 23);
        Person person4 = new Person ("Emery", 2);

        int birthYear1 = person1.getBirthYear();
        int birthYear2 = person2.getBirthYear();

        int newAge1 = person1.newAge(5);
        int newAge2 = person2.newAge(9);

        int futureAge = person1.getAgeInYears(5);

        boolean canDrive1 = person1.canDrive();
        boolean canDrive2 = person2.canDrive();
        boolean canDrive3 = person3.canDrive();
        boolean canDrive4 = person4.canDrive();

        boolean olderAge1 = person1.isOlderThan(1);
        boolean olderAge4 = person4.isOlderThan(20);

        String compareAge1 = person1.compareAge(person2);
        String compareAge2 = person1.compareAge(person3);
        String compareAge3 = person1.compareAge(person4);

        person1.introduce();
        person2.introduce();
        
        person1.celebrateBirthday();
        person2.celebrateBirthday();

        System.out.println(person1.name + " was born in " + birthYear1);
        System.out.println(person2.name + " was born in " + birthYear2); 

        person1.addYears(5);
        person2.addYears(9);

        System.out.println(person1.name + " is now " + newAge1);
        System.out.println(person2.name + " is now " + newAge2); 

        System.out.println(futureAge);

        System.out.println(canDrive1);
        System.out.println(canDrive2);
        System.out.println(canDrive3);
        System.out.println(canDrive4);

        System.out.println(olderAge1);
        System.out.println(olderAge4);

        System.out.println(compareAge1);
        System.out.println(compareAge2);
        System.out.println(compareAge3);

    }
}
