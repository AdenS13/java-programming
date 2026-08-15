
public class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old. ");
    }

    public void celebrateBirthday() {
        age = age + 1;
        System.out.println("Happy birthday " + name + "! You are now " + age + ".");
    }

    public int getBirthYear() {
        return 2026 - age;
    }

    public int newAge(int years) {
        age += years;
        return age;
    }

    public void addYears(int years) {
        System.out.println(name + " it has been " + years + " years since we spoke last.");
        age += years;
        System.out.println("You're " + age + " years old now and I can't believe it");
    }

    public int getAgeInYears(int years) {
        return years + age;
    }

    public boolean canDrive() {
        return age >= 16;
    }

    public boolean isOlderThan(int olderAge) {
        return age >= olderAge;
    }

    public String compareAge(Person person) {
        if(person.age < age) {
            return name + " is older than " + person.name;
        } else if (person.age == age) {
            return name + " is the same age as " + person.name;
        } else {
            return person.name + " is older than " + name;
        }
    }
}
