public class Employee {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String introduce() {
        return "Hi, I'm " + name + " and I make $" + salary + " an hour!";
    }

    public int raiseTime(int raise) {
        return salary += raise;
    }
}