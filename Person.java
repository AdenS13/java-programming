
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
}
